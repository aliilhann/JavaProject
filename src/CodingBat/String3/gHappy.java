package CodingBat.String3;

public class gHappy {
    /*
    We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
    Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
     */
    public static boolean gHappy(String str) {
        str="x"+str+"x";
        for(int i=1;i<str.length();i++){
            if(str.substring(i,i+1).equals("g")&&str.substring(i-1,i+2).indexOf("gg")==-1)
                return false;
        }
        return true;
    }
        /*
        boolean b=true;
      for(int i=0;i<str.length();i++) {
          if (str.charAt(i) == 'g') {
              if (i > 0 && str.charAt(i - 1) == 'g')
                  b = true;
              else if (i < str.length() - 1 && str.charAt(i + 1) == 'g')
                  b = true;
              else
                  b = false;
          }
      }
        return b;

         */

    public static void main(String[] args) {
        System.out.println(gHappy("xxggx"));
    }
}
