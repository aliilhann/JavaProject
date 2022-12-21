package Repls;

import java.util.ArrayList;
import java.util.Scanner;

public class Repls188 {

}
class Main188 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=0;i <5;i++) {
            numbers.add(scanner.nextInt());
        }
        for(Integer num:numbers) {
            System.out.println(num);
        }
        }
    }

