package JavaClass.Class21;

public class Degree {
    void getPrerequisite() {
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelor extends Degree {
}
class Master extends Degree {
    void getPrerequisite() {
        System.out.println("To get a master degree you need a Bachelors degree");
    }
}
class Main {
    public static void main(String[] args) {
        Degree degree=new Degree();
        Bachelor bachelor=new Bachelor();
        Master master=new Master();
       degree.getPrerequisite();
       bachelor.getPrerequisite();
        master.getPrerequisite();
    }
}