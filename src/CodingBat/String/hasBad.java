package CodingBat.String;

public class hasBad {
    /*
    Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
    such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
     Note: use .equals() to compare 2 strings.

hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
     */
    public static boolean hasBad(String str) {
        if(((str.indexOf('b')==0 && str.indexOf('a')==1 && str.indexOf('d')==2)) || ((str.indexOf('b')==1 && str.indexOf('a')==2 && str.indexOf('d')==3))) {
            return true;
        }
        /*
        if(str.length()<3) {
            return false;
        }else if(str.length()==3) {
            if(str.equals("bad")) {
                return true;
            }else {
                return false;
            }
        }
        else {
            if (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")) {
                return true;
            }
            return false;
        }
    }

         */
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasBad("abada"));
    }
}
