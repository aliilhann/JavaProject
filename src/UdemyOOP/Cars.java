package UdemyOOP;

public class Cars {
    private String color;
    private int  numberODoors;
    private int numberOfWheels;
   private String model;
    private String make;

    public void setModel(String model) {
        this.model=model;
    }
    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberODoors() {
        return numberODoors;
    }

    public void setNumberODoors(int numberODoors) {
        this.numberODoors = numberODoors;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
class CarTester {
    public static void main(String[] args) {
        Cars car=new Cars();
      //  car.color="Yellow";
        car.setMake("Mercedes");
        //car.model="GLC 300";
        car.setNumberODoors(4);
         car.setModel("Mercedes");
        System.out.println(car.getModel());


       // System.out.println(car.color);
    }
}