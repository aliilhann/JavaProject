package JavaClass.Class20;

public class HW3 {
    static void players(String name, int score, String game) {
        System.out.println(name + " collected " + score + " point " + " in the last " + game + " tournament");
    }

    static void players(String name, String game) {
        System.out.println(name + " collected " + " unknown point " + " in the last " + game + " tournament");
    }

    static void players(int score, String game) {
        System.out.println("Unknown player collected " + score + " in the last " + game + " tournament");
    }

    public static void main(String[] args) {
        HW3 hw=new HW3();
        hw.players("dyLan",100,"chess");
        hw.players(150,"chess");
        hw.players("LeyLa","chess");
    }
}