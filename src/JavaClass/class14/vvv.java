package JavaClass.class14;

import java.util.ArrayList;

public class vvv {
}
class Main{
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>();
        words.add("hi");
        words.add("yo");
        words.add("sup");
        words.add("yolo");
        words.add("boop");
        for(int i = 0; i < words.size(); i++){
            words.remove(i);
        }
        for(String a:words) {
            System.out.print(a+" ");
        }


    }
}
