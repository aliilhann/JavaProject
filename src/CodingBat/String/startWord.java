package CodingBat.String;

public class startWord {
    /*
    Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front
    of the string, except its first char does not need to match exactly.
    On a match, return the front of the string, or otherwise return the empty string.
     So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
      The word will be at least length 1.

startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"
     */
    public String startWord(String str, String word) {
        if(str.length()==0) {
            return str;
        }else if(str.length()==1) {
            if(str.equals(word.substring(0,1)) || word.length()==1) {
                return str;
            }else {
                return"";
            }
        }else {
            if(word.equals(str.substring(0,word.length()+1)) || word.substring(1).equals(str.substring(1,word.length()+1))) {
                return str.substring(0,word.length());
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String str="abcdefgh";
        String word="12345";
        System.out.println(str.substring(0,word.length()));
    }
}


