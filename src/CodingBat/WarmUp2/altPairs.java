package CodingBat.WarmUp2;

public class altPairs {
    /*
    Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
     */
    public static String altPairs(String str) {
        String str2="";
        String str3="";
        for(int i=0 ; i<str.length();i+=4 ) {
            str2=str2+str.charAt(i);
        }
        for(int i=1 ; i<str.length();i+=4 ) {
            str3=str3+str.charAt(i);
        }

        return str2+str3;
    }

    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));

    }

}
