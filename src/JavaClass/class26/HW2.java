package JavaClass.class26;

import java.util.LinkedList;

public class HW2 {
    /*
    Create a Card class that will have implemented  and unimplemented methods
    and a constructor that will initializes credit card type.
     Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
     Using for loop/advanced for loop/ iterator access all methods of the class.
     */
    public static void main(String[] args) {
        BankoOfAmerica bankoOfAmerica=new BankoOfAmerica("BOAVisa");
        Chase chase=new Chase("ChaseMasterCard");
        AmericanExpress americanExpress=new AmericanExpress("AmericanExpressCard");

        LinkedList<Card> cards=new LinkedList<>();
        cards.add(bankoOfAmerica);
        cards.add(chase);
        cards.add(americanExpress);

        for(var card:cards) {
            card.info();
           card.print();
        }
    }
}
abstract class Card {
    String cardType;

    public Card(String cardType) {
        this.cardType = cardType;
    }

    void print() {
        System.out.println("You should make regular monthly payment to avoid late fee");
    }
    abstract void info();

}
class BankoOfAmerica extends Card{

    public BankoOfAmerica(String cardType) {
        super(cardType);
    }

    @Override
    void info() {
        System.out.println(cardType + " is good to use abroad");
    }


}
class Chase extends Card{

    public Chase(String cardType) {
        super(cardType);
    }

    @Override
    void info() {
        System.out.println(cardType + " is good to use at hotels");
    }

}
class AmericanExpress extends Card{

    public AmericanExpress(String cardType) {
        super(cardType);
    }

    @Override
    void info() {
        System.out.println(cardType + " is good at shopping");
    }


}
