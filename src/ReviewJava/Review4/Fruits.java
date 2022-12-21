package ReviewJava.Review4;

public class Fruits {
    protected String name;
    String shape;
    private String color;

    public static boolean fresh;

   public Fruits(String name) {
       this.name=name;
    }

    public Fruits(String name, String shape, String color) {
       this(name);
        this.shape = shape;
        this.color = color;
    }

  void grow() {
        System.out.println("All fruits grow fresh "+ fresh);
    }
    void givBenefits() {

    }
}

