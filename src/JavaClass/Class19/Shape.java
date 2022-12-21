package JavaClass.Class19;

public class Shape {
    double radius;

    Shape(double radius) {
        this.radius=radius;
    }
}
class Circle extends Shape{
    Circle(double radius) {
        super(radius);
    }
    void calculateArea() {
        double area;
        area=radius*radius*3.14;
        System.out.println("The area of the circle is " + area);
    }
}
class AreaTester {
    public static void main(String[] args) {
        Circle circle=new Circle(12);
        circle.calculateArea();
    }
}

