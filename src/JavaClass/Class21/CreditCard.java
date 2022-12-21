package JavaClass.Class21;

public class CreditCard {
    double balance;
    double interest;
    void calculateInterest(double balance) {

        System.out.println("The interest amount is  "+balance*0.08);

    }
}
class Visa extends CreditCard{

}
class AX extends CreditCard {
    void calculateInterest(double balance) {
        System.out.println("With AX The interest amount is  " + balance * 0.1);
    }
}
class Main2 {
    public static void main(String[] args) {
        CreditCard creditCard=new CreditCard();
        creditCard.calculateInterest(1000);
        Visa visa=new Visa();
        visa.calculateInterest(2000);
        AX ax=new AX();
        ax.calculateInterest(3000);


        double i=0.10;
        int a=10000;
        int b=100;
        System.out.println("The interest is " + ((i*a)+b)+ ".");
    }




}
