package Udemy;

public class Methods4Return {
     int multiplyby2(int a) {

        return a*2;

    }
    static int addby2(int a) {

        return a+2;
    }
    static int multiplyby4(int a) {
        return a*4;
    }

    public static void main(String[] args) {
         Methods4Return main=new Methods4Return();
         main.multiplyby2(3);
        System.out.println(multiplyby4(addby2(main.multiplyby2(6))));
    }
}
