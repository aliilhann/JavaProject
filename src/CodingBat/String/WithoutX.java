package CodingBat.String;

public class WithoutX {
    /*

Given a string, if the first or last chars are 'x', return the string without those 'x'
chars, and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
     */
    public static String withoutX(String str) {
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
            if(str.charAt(0)=='x' && str.charAt(str.length()-1)=='x') {
                return str.substring(1,str.length()-1);
            }else if(str.charAt(0)=='x') {
                return str.substring(1);
            }else if(str.charAt(str.length()-1)=='x') {
                return str.substring(0,str.length()-1);
            }
        }


        return str;
    }

    public static void main(String[] args) {

    }

         */
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (str.length() > 0 && str.charAt(str.length()-1) == 'x') {
            str = str.substring(0, str.length()-1);
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(withoutX("xhix"));
    }
}