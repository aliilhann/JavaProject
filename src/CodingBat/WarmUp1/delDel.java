package CodingBat.WarmUp1;

public class delDel {
   static  String delDel(String str) {
        String str2= String.valueOf(str.charAt(0));

        if(str.length()>=4 &&str.substring(1,4).equals("del")) {
            return str2+str.substring(4);
        }return str;
    }

    public static void main(String[] args) {
        System.out.println(delDel("adeldel"));
    }
}
