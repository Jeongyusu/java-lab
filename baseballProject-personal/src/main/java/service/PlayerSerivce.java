package service;

public interface PlayerSerivce {

    public void playerInsert(int teamId, String name, String position);
    public void getPlayerByTeam(int teamId);
    public void getPlayerbyPosition();
}
