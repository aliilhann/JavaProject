package Constructors;

public class Book {

    String author;
    String title;
    int pageNumber;

    Book(String newAuthor, String newTitle, int newPageNumber) {
        author=newAuthor;
        title=newTitle;
        pageNumber=newPageNumber;
    }
    Book() {

    }
    void print() {
        System.out.println("The title of the book is " + title + " the author is "+ author + ".It has "+ pageNumber + " page");
    }


}