package JavaClass.Class19;

public class Furniture {
    String color = "Green";
}
class Chair extends Furniture {
        String color="Red";

        void printColor() {
            String color="purple";
            System.out.println(color); //local

            System.out.println(this.color); //static
            System.out.println(super.color); //parent class
        }
    }
    class test{
        public static void main(String[] args) {
           Chair chair=new Chair();
            chair.printColor();
        }
    }


