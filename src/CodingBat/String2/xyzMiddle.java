package CodingBat.String2;

public class xyzMiddle {
    /*

Given a string, does "xyz" appear in the middle of the string? To define middle,
 we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
 This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
     */
    public static boolean xyzMiddle(String str) {
       for(int i=0; i<str.length()-2; i++) {

           if(str.substring(i,i+3).equals("XYZ")) {
               int a=str.substring(0,i).length();
               int b=str.substring(i+3).length();
               if(Math.abs(a-b)<=1) {
                   return true;
               }
           }
       }

        return false;
    }





        /*
        int i=str.indexOf("xyz");
        String front=str.substring(0,i);
        String end=str.substring(i+3);
        System.out.println(front.length());
        System.out.println(end.length());
        System.out.println(i);
        if(Math.abs(front.length()-end.length())<=1) {
            return true;
        }
        return false;

         */

    // }
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AxyzBBB"));

    }


}



