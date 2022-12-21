package String;

public class StringReview2 {
    public static void main(String[] args) {
        String text = "  Enroll today";
        String textFromUserStory = "Enroll today";
        if (text.trim().equals(textFromUserStory)) {
            System.out.println("Text is matched");
        } else {
            System.out.println("Text is not matched");
    }
        String str="hello world";
        String str2="";
        for(int i=str.length()-1; i>=0; i--) {
         str2+=str.charAt(i);


        }System.out.println(str2);

        String myStr= "Homework";
        char[] c= myStr.toCharArray();
        for(int i=c.length-1; i>=0; i--) {
            System.out.print(c[i]+ " ");

        }


        }

}
