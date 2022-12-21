package CodingBat.String3;

public class SumNumbers {
    /*

Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is
 one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumNumbers("abc123xyz") → 123
sumNumbers("aa11b33") → 44
sumNumbers("7 11") → 18
     */
    public static void main(String[] args) {
        System.out.println(sumNumbers("abc12v3bg4"));

    }
    public static int sumNumbers(String str) {
        int sum=0;
        String str2="";
        for(int i=0; i<str.length();i ++) {
            if(Character.isDigit(str.charAt(i))) {
                if(i<str.length()-1 && Character.isDigit(str.charAt(i+1))) {
                    str2+=str.charAt(i);
                }else {
                    str2+=str.charAt(i);
                    sum+=Integer.parseInt(str2);
                    str2="";
                }
            }
        }

        /*
        int sum=0;
    String str2=str.replaceAll("[^0-9]"," ");
    String []arr=str2.split(" ");
       for(int i=0; i<arr.length;i++) {
           if(!arr[i].isEmpty() ) {

               sum+=Integer.parseInt(arr[i]);
           }
       }
        return sum;

         */
        return sum;
    }


}
