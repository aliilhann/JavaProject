package Repls;

public class Repls226 {
    /*
    Reverse the String without using the Reverse method from the BtringBuilder Class input["I am a java Programmer"]
     output["Programmer java a am I"]

input["Syntax is Great"] output["Great is Syntax"]
     */
    public static void main(String[] args) {
        System.out.println("Hello world!");
       System.out.println(reverse("I love Java"));
    }
    public static String reverse(String strToRev){
        String reverse="";
        String [] array=strToRev.split(" ");

        for(int i=array.length-1; i>=0; i--) {

            reverse+=array[i]+" ";
        }
        return reverse;
    }
}
