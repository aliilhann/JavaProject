package Repls;

public class WordEnds {
    /*

Given a string and a non-empty word string, return a string made of each char just before
and just after every appearance of the word in the string.
Ignore cases where there is no char before or after the word,
and a char may be included twice if it is between two words.


wordEnds("abcXY123XYijk", "XY") → "c13i"
wordEnds("XY123XY", "XY") → "13"
wordEnds("XY1XY", "XY") → "11"
     */
    public static String wordEnds(String str, String word) {
        String str2="";
        for(int i=0; i<str.length();i ++) {
            if(str.length()<=word.length()) {
                return "";
            }
            if(i==0&& str.substring(0,word.length()).equals(word)) {
                str2+=str.substring(word.length(),word.length()+1);
                i+=word.length()-1;
            }
            if(i>0 && i<str.length()-word.length() && str.substring(i,i+word.length()).equals(word)) {
                str2+=str.substring(i-1,i)+str.substring(i+word.length(),i+word.length()+1);
            }if(i>0 && i<str.length() && str.substring(i).equals(word)){
                str2+=str.substring(i-1,i);
            }

        }
        String str3="";
        for(int i=0; i<str.length()-word.length()+1;i++) {
            if(i>0 && str.substring(i,i+word.length()).equals(word)) {
                str3+=str.substring(i-1,i);

            }if(i<str.length()-word.length() && str.substring(i,i+word.length()).equals(word)) {
                str3+=str.substring(i+word.length(),i+word.length()+1);
            }
        }
           return str3;
    }

    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijkXY","XY"));
    }

}
