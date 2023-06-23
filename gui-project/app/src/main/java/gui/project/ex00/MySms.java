package gui.project.ex00;

import net.nurigo.sdk.NurigoApp;
import net.nurigo.sdk.message.model.Message;
import net.nurigo.sdk.message.request.SingleMessageSendingRequest;
import net.nurigo.sdk.message.response.SingleMessageSentResponse;
import net.nurigo.sdk.message.service.DefaultMessageService;

public class MySms {
    public static void main(String[] args) {

        DefaultMessageService messageService = NurigoApp.INSTANCE.initialize("NCSVOPNPWTSBXTC5",
                "WRUHKMFI0D8UGYJ0LPZP9KPMA3Z6NH1M",
                "https://api.coolsms.co.kr");
        Message message = new Message();
        // 발신번호 및 수신번호는 반드시 01012345678 형태로 입력되어야 합니다.
        message.setFrom("01044112545");
        message.setTo("01044112545");
        message.setText("정유수");

        SingleMessageSentResponse response = messageService.sendOne(new SingleMessageSendingRequest(message));
        System.out.println(response);
    }

}
