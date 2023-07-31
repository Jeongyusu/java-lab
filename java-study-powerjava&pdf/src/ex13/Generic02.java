package ex13;

class 윤석열 {
    // new를 할 수 없는 경우(new해서 코드 설계가 불가능한 경우)에 주로 Object 타입 변수 사용

    private Object data;
    private static 윤석열 instance = new 윤석열();

    public static 윤석열 getInstance() {
        return instance;
    }

    private 윤석열() {
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

public class Generic02 {
    public static void main(String[] args) {
        윤석열 d1 = 윤석열.getInstance();
        d1.setData(1);

        int value = (int) d1.getData();
        System.out.println(value);

    }
}