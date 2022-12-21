package JavaClass.Class20;

public class HW4 {
    private void books(String author, String title, int page) {
        System.out.println(author + " has a book named " + title + " and it has " + page + " pages");
    }
    private void books(String title, int page) {
        System.out.println(title + " has " + page + " pages");
    }
    private void books(String author, String title) {
        System.out.println(author+ "'s best known book is " + title);
    }

    public static void main(String[] args) {
        HW4 hw=new HW4();
        hw.books("Orhan Pamuk","My Name is Red",505);
        hw.books("Of Mice and Men",126);
        hw.books("Victor Hugo","Les Miserables");
    }
}
