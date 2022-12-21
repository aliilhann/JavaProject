package JavaClass.Class28;

import java.util.LinkedHashMap;

public class HW3 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> bestBuy=new LinkedHashMap<>();
        bestBuy.put(7664847,"Printer");
        bestBuy.put(7559420,"Sofa");
        bestBuy.put(845234,"Jersey");
        bestBuy.put(845002,"Dining Table");
        bestBuy.put(7664847,"Printer");

       var items=bestBuy.entrySet();

       for(var item:items) {
           System.out.println("The id number of "+ item.getValue() +" is "+ item.getKey());
       }


    }
}
