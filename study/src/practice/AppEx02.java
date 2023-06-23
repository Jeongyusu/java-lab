package practice;

public class AppEx02 {
    public static void main(String[] args) {

        BurgerSet bs2 = new BurgerSet();

        int setPrice = bs2.getPotato().getPrice() + bs2.getCoke().getPrice() + bs2.getPotato().getPrice();
        String setDesc = bs2.getPotato().getDesc() + ", " + bs2.getCoke().getDesc() + ", " + bs2.getBurger().getDesc();

        System.out.println("버거세트의 가격은" + setPrice + "입니다.");
        System.out.println("버거세트는의 구성은 " + setDesc + "입니다.");

    }

}
