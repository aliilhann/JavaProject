package JavaClass.Class23;

public interface Person {
    void eat();
}
interface Employee{
    void work();
}

interface SyntaxEmployee extends Employee, Person {
   void creatRepl();
}
class Ashghar implements SyntaxEmployee {

    @Override
    public void eat() {

    }

    @Override
    public void work() {

    }

    @Override
    public void creatRepl() {

    }
}