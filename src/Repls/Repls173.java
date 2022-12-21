package Repls;

public class Repls173 {

}
abstract class Tea {
    String teaType;

    Tea(String teaType) {
        this.teaType=teaType;
    }
    abstract void addSugar();
}
class LemonTea extends Tea {

    LemonTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println(teaType + " we need 2 spoons of sugar");

    }
}
class ChaiTea extends Tea {

    ChaiTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {
        System.out.println(teaType + " we need 1 spoons of sugar");

    }
}
class Main173 {
    public static void main(String[] args) {
        Tea tea= new LemonTea("Lemon Tea");
        Tea tea1= new ChaiTea("Chai Tea");
        tea.addSugar();
        tea1.addSugar();
    }

}
