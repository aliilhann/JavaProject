package Constructors;

public class TestBook {
    public static void main(String[] args) {
        Book book1 = new Book("Emile Zola", "Germinal", 610);
        book1.print();
        Book book2=new Book();
        book2.print();
    }
}
