package service;

import db.DBConnection;
import model.outPlayer.OutPlayerDAO;
import model.player.PlayerDAO;
import model.stadium.StadiumDAO;
import model.team.TeamDAO;

import java.sql.Connection;

public class ParsingScanner {


    Connection connection = DBConnection.getInstance();
    StadiumService stadiumService = new StadiumDAO(connection);
    PlayerSerivce playerSerivce = new PlayerDAO(connection);
    TeamService teamService = new TeamDAO(connection);
    OutPlayerService outPlayerService = new OutPlayerDAO(connection);
    boolean val = true;

    public void parseToRequest() {

        while (val) {
            System.out.println("어떤 기능을 요청하시겠습니까?");
            java.util.Scanner sc = new java.util.Scanner(System.in);
            String input = sc.nextLine();
            String request = input.split("\\?")[0];

            try {
                if (request.equals("야구장등록")) {
                    String stadiumName = input.split("\\?")[1].split("name=")[1];
                    stadiumService.stadiumInsert(stadiumName);
                } else if (request.equals("야구장목록")) {
                    stadiumService.getAllStadium();
                } else if (request.equals("선수등록")) {
                    int teamId = Integer.parseInt(input.split("\\?")[1].split("&")[0].split("teamId=")[1]);
                    String playerName = input.split("\\?")[1].split("&")[1].split("name=")[1];
                    String position = input.split("\\?")[1].split("&")[2].split("position=")[1];
                    playerSerivce.playerInsert(teamId, playerName, position);
                } else if (request.equals("팀등록")) {
                    int stadiumId = Integer.parseInt(input.split("\\?")[1].split("&")[0].split("stadiumId=")[1]);
                    String stadiumName = input.split("&")[1].split("name=")[1];
                    teamService.teamInsert(stadiumId, stadiumName);
                } else if (request.equals("팀목록")) {
                    teamService.getAllTeam();
                } else if (request.equals("선수목록")) {
                    int searchTeamId = Integer.parseInt((input.split("teamId=")[1]));
                    playerSerivce.getPlayerByTeam(searchTeamId);
                } else if (request.equals("퇴출등록")) {
                    int outPlayerId = Integer.parseInt(input.split("\\?")[1].split("&")[0].split("playerId=")[1]);
                    String reason = input.split("&")[1].split("reason=")[1];
                    outPlayerService.outPlayerInsertAndNullUpdate(outPlayerId, reason);
                } else if (request.equals("퇴출목록")) {
                    outPlayerService.getAllPlayersDebidebyOut();
                } else if (request.equals("포지션별목록")) {
                    playerSerivce.getPlayerbyPosition();
                } else if (request.equals("종료")) {
                    System.out.println("입력을 종료합니다");
                    val = false;
                } else {
                    System.out.println("잘못된 요청입니다.");
                }
            } catch (Exception e) {
                System.out.println("잘못된 명령어입니다.");

            }
        }
    }

}
