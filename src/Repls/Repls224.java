package Repls;

public class Repls224 {
   /*
   Remove Consecutive duplicates
Write the logic to remove only consecutive duplicates

input ["aabbcde"]-> output["abcde"]

input ["aabbcc"]-> output["abc"]

input ["aabbcca"]-> output["abca"]

input ["aabbccaddda"]-> output["abcada"]
    */
   public static void main(String[] args) {
      // System.out.println("Hello world!");
      // System.out.println(removeConsecutiveDuplicates("aabbcde"));
      // System.out.println(removeConsecutiveDuplicates("aabbcc"));
      // System.out.println(removeConsecutiveDuplicates("aabbcca"));
       System.out.println(removeConsecutiveDuplicates("aabbccaddda"));
   }

    public static String removeConsecutiveDuplicates(String input) {
        if (input.length() <=1) {
            return input;
        }
        if (input.substring(0,1).equalsIgnoreCase(input.substring(1,2))) {
            return removeConsecutiveDuplicates(input.substring(0, 1) + input.substring(2));
        }
        else {
            return input.substring(0,1) +removeConsecutiveDuplicates(input.substring(1));
        }
    }
}

