package CodingBat.WarmUp1;

public class backAround {
    /*
    Given a string, take the last char and return a new string with the last char
    added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
    backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
     backAround("a") → "aaa"
     */
    public String backAround(String str) {
        String a=""+str.charAt(str.length()-1);
        str=a+str+a;
        return str;

    }

    public static void main(String[] args) {
        backAround back=new backAround();
        System.out.println(  back.backAround("hello"));
    }
}
