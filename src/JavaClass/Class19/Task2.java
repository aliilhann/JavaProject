package JavaClass.Class19;

public class Task2 {
    public static void main(String[] args) {
        Book book=new Book("Germinal","Emile Zola",650,"realistic");
        Book book1=new Book("Red and Black","Stendhal", 728);
        System.out.println("The name of the book is "+ book.name);
    }

  }
  class Book {
        String name;
        String author;
        int page;
        String type;

        public Book(String name, String author,int page,String type) {
            this(name, author, page);
            this.type=type;
        }
        public Book(String name, String author,int page) {
            this.name=name;
            this.author=author;
            this.page=page;
        }
    }


