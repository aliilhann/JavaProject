package CodingBat.String;

public class endsLy {
    /*

Given a string, return true if it ends in "ly".
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
     */
    public static boolean endsLy(String str) {
        String str2="";
        if(str.length()<2) {
            return false;
        }
        else {
            str2=str.substring(str.length()-2);
            if(str2.equals("ly")) {
                return true;
            }else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(endsLy("l"));
    }
}
