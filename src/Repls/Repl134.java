package Repls;

public class Repl134 {
    static int countVowels(String s) {
        s=s.replaceAll("[^aeiou]","");


        return s.length();
    }
    {

    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}
