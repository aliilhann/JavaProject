package Methods;

import java.util.Scanner;

public class HW7 {
    void getGrade(int score) {
        if(score>=90) {
            System.out.println("Your letter grade is A");
        }else if(score<90 && score>=80) {
            System.out.println("Your letter grade is B");
        }else if(score<80 && score>=70) {
            System.out.println("Your letter grade is C");
        }else if(score<70 && score>=50) {
            System.out.println("Your letter grade is D");
        }else {
            System.out.println("Your letter grade is F");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your grade");
        int input=scanner.nextInt();
        HW7 grade=new HW7();
        grade.getGrade(input);
    }
}