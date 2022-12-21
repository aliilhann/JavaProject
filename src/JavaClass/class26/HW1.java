package JavaClass.class26;

import java.util.ArrayList;

public class HW1 {
    /*
    Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
    Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has petType attribute.
    Create 3 objects of the sub classes and store them in ArrayList. Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    public static void main(String[] args) {
        Car car=new Car("Progressive","Mercedes");
        Pet pet=new Pet("Paws","Cat");
        Health health=new Health("Aetna");

        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(car);
        insurances.add(pet);
        insurances.add(health);

        for(var insurance:insurances) {
            insurance.getQuote(0);
            insurance.cancelInsurance(0);
        }
    }
}
abstract class Insurance {
    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    abstract void getQuote(double num);
   abstract void cancelInsurance(double cancelFee);


}
class Car extends Insurance {
    String carModel;

    public Car(String insuranceName,String carModel) {
        super(insuranceName);

        this.carModel = carModel;
    }
    @Override
    void getQuote(double num) {
        num=125;
        System.out.println("The quote of "+insuranceName +" insurance for "+ carModel + "  is $"+ num+ " per month");
    }

    @Override
    void cancelInsurance(double cancelFee) {
        cancelFee=100;
        System.out.println("The early cancellation fee of "+insuranceName +" insurance for "+ carModel + "  is $"+ cancelFee);
    }

}
class Pet extends Insurance {
    String petType;

    public Pet(String insuranceName,String petType) {
        super(insuranceName);
        this.petType = petType;
    }
    @Override
    void getQuote(double num) {
        num=35;
        System.out.println("The quote of "+insuranceName +" insurance for "+ petType + " is $"+ num+ " per month");
    }
    @Override
    void cancelInsurance(double cancelFee) {
          cancelFee=50;
        System.out.println("The early cancellation fee of "+insuranceName +" insurance for "+ petType + "  is $"+ cancelFee);
    }
}
class Health extends Insurance {

    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote(double num) {
        num=200;
        System.out.println("The quote of "+insuranceName+" health insurance is $"+ num+ " per month");
    }
    @Override
    void cancelInsurance(double cancelFee) {
        cancelFee=185;
        System.out.println("The early cancellation fee of "+ insuranceName + " healtth insurance is $"+ cancelFee);
    }
}