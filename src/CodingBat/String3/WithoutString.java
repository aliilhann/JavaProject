package CodingBat.String3;

public class WithoutString {
    /*
    Given two strings, base and remove, return a version of the base string where all instances of the remove
     string have been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
     */
    public static String withoutString(String base, String remove) {
        String str2="";
        for(int i=0; i<base.length()-remove.length()+1;i++) {
            if(base.substring(i,remove.length()+i).equalsIgnoreCase(remove)) {
                i+=remove.length();
            }else {
               str2+=base.charAt(i);
            }
        }
        if(!base.substring(base.length()-remove.length()).equalsIgnoreCase(remove)) {
            str2+=base.substring(base.length()-remove.length()+1);
        }

        return str2;
    }

    public static void main(String[] args) {
        System.out.println(withoutString("xxx","xx"));
    }
}