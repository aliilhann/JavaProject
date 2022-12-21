package JavaClass.class14;

public abstract class Tea {
    String teaType;

    public Tea(String teaType) {
        this.teaType = teaType;
    }
    abstract void addSugar();
}
class lemonTea extends Tea{


    public lemonTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {

    }
}
class ChaiTea extends Tea {

    public ChaiTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {

    }
}
class Main45 {
    public static void main(String[] args) {

    }
}