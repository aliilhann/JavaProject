package ReviewJava.Review3;

 public class Country {
    public String name;
    protected String capital;
    int population;
    private String president;
    Country() {
        System.out.println("Country class constructor");
    }

}
 class Peru extends Country {
    public static void main(String[] args) {
        Peru peru=new Peru();
        peru.name= "Peru";
        peru.capital="Lima";
        peru.population=350000;



    }
}
