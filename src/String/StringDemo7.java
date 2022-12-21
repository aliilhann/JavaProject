package String;

import java.util.Arrays;

public class StringDemo7 {
    public static void main(String[] args) {
        String str = "I love Java programming";
        char[] charArray = str.toCharArray();  //to convert a string into char array

        System.out.println(charArray[8]);

            System.out.println(Arrays.toString(charArray));

            int sum=0;
            for(char sumf:charArray ) {
                if(sumf=='a') {
                    sum++;
                }
            }
        System.out.println(sum);
        }
    }
