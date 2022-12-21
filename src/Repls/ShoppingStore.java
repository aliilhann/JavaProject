package Repls;

public class ShoppingStore {
    String item;
    double price;
    int quantity;

    ShoppingStore(String item,double price,int quantity) {
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    double calculateValue() {

       double totalValue=price*quantity;

        return totalValue;
    }

}
class main7 {
    public static void main(String[] args) {
        ShoppingStore item1=new ShoppingStore("Blanket",19.996,5);
        ShoppingStore item2=new ShoppingStore("Mattress",109.795,4);
        System.out.println(item1.item +" Total Value "+ item1.calculateValue());
        System.out.println(item2.item +" Total Value "+ item2.calculateValue());
        System.out.println("You purchased "+ (item1.calculateValue()+item2.calculateValue()) +" today");
    }
}
