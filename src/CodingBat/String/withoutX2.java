package CodingBat.String;

public class withoutX2 {
    /*

Given a string, if one or both of the first 2 chars is 'x',
return the string without those 'x' chars, and otherwise return the string unchanged.
This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
     */
    public static String withoutX2(String str) {
        /*
        if(str.length()==0) {
            return str;
        }else if(str.length()==1) {
            if(str.equals("x")) {
                return "";
            }else {
                return str;
            }
        }else {
            if (str.charAt(0) != 'x' && str.charAt(1) != 'x') {
                return str;
            } else if (str.charAt(0) == 'x' && str.charAt(1) == 'x') {
                return str.substring(2);
            } else if (str.charAt(0) == 'x') {
                return str.substring(1);
            } else if (str.charAt(1) == 'x') {
                return str.charAt(0) + str.substring(2);
            }
        }
        return str;

         */
        if(str.length()>0 && str.charAt(0)=='x') {
            str=str.substring(1);
        }
        if(str.length()>0 && str.charAt(0)=='x') {
            str=str.substring(1);
        }
        if(str.length()>0 && str.charAt(1)=='x'){
            str=str.charAt(0)+str.substring(1);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(withoutX2("xx22"));
    }
}
