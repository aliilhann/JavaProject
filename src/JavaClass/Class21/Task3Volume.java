package JavaClass.Class21;

public class Task3Volume {
    public static void main(String[] args) {
        AreaManager areaManager=new AreaManager();
        areaManager.calculateArea(6,7);
    }
}
class AreaManager {

    void calculateArea(double length, double width) {
        System.out.println(length * width);
    }

    void calculateArea(double length) {
        System.out.println(length * length);
    }
}