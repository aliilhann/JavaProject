package Repls;

public class Repls140 {


    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long"};
         System.out.println(maxLength(arr));
        //should print "this is long"
    }

    static String maxLength(String[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if(str.length()<arr[i].length()) {
                str=arr[i];
            }
        }
        return str;
    }
}


