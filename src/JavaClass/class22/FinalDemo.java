package JavaClass.class22;

public class FinalDemo {
    public static void main(String[] args) {
        Iphone iphone=new Iphone();
        iphone.takePics();



    }
}
class Phone{
    final int RAM=12;

 final  void takePics(){

     System.out.println("The phone takes pictures");
        }

    }
 class Iphone extends Phone {

}
