package CodingBat.String;

public class lastTwo {
    /*
    Given a string of any length, return a new string where the last 2 chars,
    if present, are swapped, so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
     */
    public String lastTwo(String str) {
        if(str.length()<2) {
            return str;
        }
        return str.substring(0,str.length()-2)+str.charAt(str.length()-1)+str.charAt(str.length()-2);

        /*
        String str2="";
        String str3="";
        if(str.length()<2) {
            return str;
        }else if(str.length()==2){
            str2=str.substring(0,1);
            str3=str.substring(1);
            return str2+str3;
        }else {
            str2=str.substring(str.length()-2,str.length()-1);
            str3=str.substring(str.length()-1);
            return str.substring(0,str.length()-2)+str2+str3;
        }

    }

         */
    }
}
