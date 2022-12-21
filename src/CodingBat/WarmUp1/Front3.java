package CodingBat.WarmUp1;

public class Front3 {
   String front3(String str) {
        if (str.length() < 3) {
          return str;
        }
        else{
            String front=str.substring(0,3);

        return front+front+front;


    }

}

    public static void main(String[] args) {
        Front3 front=new Front3();

        System.out.println(front.front3("lo"));
    }
}