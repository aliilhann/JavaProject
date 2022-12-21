package CodingBat.String2;

public class RepeatSeperator {
    /*

Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
separated by the separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
     */
    public String repeatSeparator(String word, String sep, int count) {
        String str2 = "";
        if (count == 0) {
            return "";
        }
            for (int i = 0; i < count-1; i++) {
                str2 += word + sep;
        }   return str2 + word;
    }
    /*
       String str2 = word;
        if (count == 0)
            return "";
            for (int i = 1; i < count; i++) {
                str2+=sep + word;
            }
            return str2 ;
     */
}
