package Variable;

public class HW2 {
    public  String str(String s) {
        StringBuilder str2=new StringBuilder(s);
        StringBuilder str3=new StringBuilder(str2.reverse());
        return str3.toString();
    }

    public static void main(String[] args) {
        HW2 main=new HW2();

        System.out.println(main.str("The Black Book"));
    }
}
