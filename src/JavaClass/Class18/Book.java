package JavaClass.Class18;

public class Book {
    String title;
    String author;
    String type;
    int page;

   Book(String title, String author) {
       this.title=title;
       this.author=author;
       System.out.println("The title of the book is " + title + "and the author is "+ author);
   }
   Book(String type, int page) {
       this.type=type;
       this.page=page;
       System.out.println("The type of the book is "+ type + ". It has "+ page + " page");
   }



    public static void main(String[] args) {
        new Book("And Then There Were None ", "Agatha Christie");
        new Book("Mystery",258);

    }


}
