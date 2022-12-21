package CodingBat.String3;

public class MaxBlock {
    /*
    Given a string, return the length of the largest "block" in the string.
     A block is a run of adjacent chars that are the same.


maxBlock("hoopla") → 2
maxBlock("abbCCCddBBBxx") → 3
maxBlock("") → 0
     */
    public static int maxBlock(String str) {
        if(str.isEmpty()){
            return 0;
        }
        str=str+" ";
         int max=0;
         int sum=0;
         for(int i=0; i<str.length()-1;i++) {
             if(str.charAt(i)==str.charAt(i+1)) {
                 sum++;

             }else {
                 if(sum>max) {
                     max=sum;
                 }
                 sum=0;
             }
         }
        return max+1;
    }

    public static void main(String[] args) {
        System.out.println(maxBlock("      aaa       "));
    }


}
