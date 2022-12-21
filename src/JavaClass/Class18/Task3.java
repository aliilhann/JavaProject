package JavaClass.Class18;

public class Task3 {

   private Task3() {
        System.out.println("private");

    }
    Task3(String name) {
        System.out.println("Default");
    }
    protected Task3(int age) {
        System.out.println("protected");
    }
    public Task3(boolean istrue) {
        System.out.println("public");
    }

    public static void main(String[] args) {
        new Task3();
        new Task3("thank you");
        new Task3(10);
        new Task3(true);


    }
}
