package JavaClass.Class20;

public class areaVolume {
   void calculate(double length, double width, double height) {
       System.out.println("The volume of the box is "+ length*width*height);

    }
    void calculate(double length, double width) {

        System.out.println("The area of the rectangle is "+ length*width);
    }
    void calculate(double length) {

        System.out.println("The area of the square is "+ length*length);
   }
}
    class areaVolumeCalculate {
        public static void main(String[] args) {
            areaVolume math = new areaVolume();
            math.calculate(8.5,9);
            math.calculate(6);
            math.calculate(10,5,9.5);
        }
    }

