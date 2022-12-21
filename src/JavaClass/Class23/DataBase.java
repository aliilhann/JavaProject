package JavaClass.Class23;

public abstract class DataBase {
    abstract void openDatabase();
    abstract void readData();
    abstract void writeDate();
    abstract void closeDatabase();
}
class MicrosoftDataBase extends DataBase {

    @Override
    void openDatabase() {
        System.out.println("Opening the Microsof Database");

    }

    @Override
    void readData() {
        System.out.println("Reading the data from MSDatabase");
    }

    @Override
    void writeDate() {
        System.out.println("Writing the data from MSDatabase ");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the MSSatabase");
    }
}
class Oracles extends DataBase {

    @Override
    void openDatabase() {
        System.out.println("Opening the Oracle Database");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from Oracle database");
    }

    @Override
    void writeDate() {
        System.out.println("Writing the data from Oracle ");
    }

    @Override
    void closeDatabase() {
        System.out.println("Closing the Oracle database");
    }
}