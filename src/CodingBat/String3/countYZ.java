package CodingBat.String3;

public class countYZ {
    /*

Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy"
and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
 We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
 (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
     */
    public static int countYZ(String str) {
        int sum=0;
        str=str.toLowerCase();
        int len=str.length();
        if(str.endsWith("y") ||str.endsWith("z")) {
            sum++;
        }
        for(int i=0; i<len;i++) {

            if(i<len-1 && (str.charAt(i)=='y'|| str.charAt(i)=='z') && !Character.isLetter(str.charAt(i+1))){
                sum++;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(countYZ("y2bz"));
    }
}
