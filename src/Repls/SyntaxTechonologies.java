package Repls;

public class SyntaxTechonologies {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;

    SyntaxTechonologies() {
    }
    SyntaxTechonologies(String schoolName, int batch, int year, String lastDayOfClass) {
        this.schoolName = schoolName;
        this.batch = batch;
        this.year = year;
        this.lastDayOfClass = lastDayOfClass;

    }

    void displayValues() {
        System.out.println(schoolName +" "+ batch +" "+ year +" "+ lastDayOfClass);

    }
}
class Main2 {
    public static void main(String[] args) {
        SyntaxTechonologies syntaxTechonologies=new SyntaxTechonologies();
        syntaxTechonologies.displayValues();
        SyntaxTechonologies syntaxTechonologies2=new SyntaxTechonologies("Syntax",6,2020,"07/30/2020");
        syntaxTechonologies2.displayValues();
    }
}

