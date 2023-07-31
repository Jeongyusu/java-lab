package ex13;

public class Thread01 {

    // CPU가 하나의 스레드를 생성하여 실행된다.
    // 실 == main 메서드

    public static void main(String[] args) {

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("서브스레드 : " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
            // target(스레드의길이)

        }).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("메인스레드 : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

}
