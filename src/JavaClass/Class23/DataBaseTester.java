package JavaClass.Class23;

public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new MicrosoftDataBase();
        dataBase.readData();
        dataBase.writeDate();
        dataBase.openDatabase();
        dataBase.closeDatabase();
    }
}
