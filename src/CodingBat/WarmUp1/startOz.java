package CodingBat.WarmUp1;

public class startOz {


    String startOz(String str) {
        String str2= String.valueOf(str.charAt(0));
         if(str.length()>=2&&str.substring(0,2).equals("oz")) {
            return "oz";
        }
        else if(str.length()>=1&&String.valueOf(str.charAt(0)).equals("o")) {
            return "o";
        }else if(str.length()>=1&&String.valueOf(str.charAt(1)).equals("z")) {
            return "z";
        }return str;

    }

    public static void main(String[] args) {

    }

}
