package JavaClass.class22;

public class Car {
    void start() {
        System.out.println("Use the key to start me");
    }
    void stop() {
        System.out.println("Use breaks to stop me");
    }
    void park() {
        System.out.println("Park me manually");
    }
}
class BMW extends Car {
      void start() {
          super.start();
         System.out.println("Use push button to start me");
     }
     void stop() {
         System.out.println("I can also use auto breaking to stop");
     }
}
class Toyota extends Car{
    void start() {
        System.out.println("Push me to start");
    }
}
class Tesla extends Car{
    void start() {
        System.out.println("use the app to start");
    }
    void stop() {
        System.out.println("Use AI and breaking to stop me");
    }
    void park() {
        System.out.println("I can auto park myself");
    }
}