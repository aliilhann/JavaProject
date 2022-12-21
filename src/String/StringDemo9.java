package String;

//import org.omg.CORBA.WStringValueHelper;

public class StringDemo9 {
    public static void main(String[] args) {
        String str="Batch 14 is good 5643238000!@#$$$ fgrgHTTHd";
        System.out.println(str.replace(" good"," excellent"));  //to replace a word into another
        System.out.println("str = " + str);       //soutv


        System.out.println(str.replaceAll("[a-z]","")); //to replace whole letters/numbers/special characters into smth
    }
}
