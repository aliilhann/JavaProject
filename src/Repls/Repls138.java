package Repls;

public class Repls138 {
    static private String methods1() {
        return "private";
    }

    String methods2() {
        return "default";
    }

    protected String methods3() {
        return "protected";
    }

    public String methods4() {
        return "public";
    }


    public static void main(String[] args) {
        Repls138 main = new Repls138();
        System.out.println(new Repls138().methods2());
        System.out.println(main.methods3());
        System.out.println(main.methods4());
    }

}
