package JavaClass.Class19;

public class Teacher {
     String name;
     String subject;
     int numberOfExperience;

     Teacher(String name,String subject,int numberOfExperience) {
         this.name=name;
         this.subject=subject;
         this.numberOfExperience=numberOfExperience;
     }

}
class MathClass extends Teacher{
      String favoriteGame;
    MathClass(String name, String subject, int numberOfExperience, String favoriteGame) {
        super(name, subject, numberOfExperience);
        this.favoriteGame=favoriteGame;
    }
    public void print() {
        System.out.println(subject +" teacher's name is " +name +" and "+ name + " has "
                + numberOfExperience + " years experience "+ " and his favorite game is " + favoriteGame );
    }
}
class ChemistryClass extends Teacher{
    double salary;
    ChemistryClass(String name, String subject, int numberOfExperience, double salary) {
        super(name, subject, numberOfExperience);
        this.salary=salary;
    }
    public void print() {
        System.out.println(subject +" teacher's name is " +name +" and "+ name + " has "
                + numberOfExperience + " years experience "+ " and she makes " + salary + " per year" );
    }
}
class PianoClass extends Teacher{
    String favoriteBook;
    PianoClass(String name, String subject, int numberOfExperience, String favoriteBook) {
        super(name, subject, numberOfExperience);
        this.favoriteBook=favoriteBook;
    }
    public void print() {
        System.out.println(subject +" teacher's name is " +name +" and "+ name + " has "
                + numberOfExperience + " years experience. Her favorite book is "+ favoriteBook);
    }
}

class TestHW3 {
    public static void main(String[] args) {
        MathClass math=new MathClass("aLi","Math",5,"tennis");
        math.print();
        ChemistryClass chemistry=new ChemistryClass("LeyLa","Chemistry",4,85000);
        chemistry.print();
        PianoClass piano=new PianoClass("eyLuL","Piano",10,"My Sweet Orange Tree");
        piano.print();
    }
}


