package Repls;

public class Repls225 {
    /*
    Reverse the number

Input[123] ->output [321]

Input[12345] ->output [54321]

Input[1001] ->output [1001]

Input[789] ->output [987]
     */
    public  static int reverseInteger(int number){
        int reverseNum=0;

        while(number>0) {
            reverseNum=reverseNum*10+number%10;
            number=number/10;
        }

        return reverseNum;
    }

    public static void main(String[] args) {
        System.out.println(reverseInteger(234));


    }
}
