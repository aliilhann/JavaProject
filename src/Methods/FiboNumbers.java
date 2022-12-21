package Methods;

public class FiboNumbers {
    void add(int num1, int num2) {
        System.out.println(num1+num2);
    }
    void printFiboSeries(int size){

        int previous=0;
        int currentNumber=1;
        int nextNum=0;
        System.out.println(previous);
        System.out.println(currentNumber);
        for(int i=0; i<size;i++) {
            nextNum=previous+currentNumber;
            System.out.println(nextNum);
            previous=currentNumber;
            currentNumber=nextNum;
        }
    }
    void printAnyWords (char w) {
        System.out.println(w);

    }

    public static void main(String[] args) {
        FiboNumbers obj=new FiboNumbers(); // Creating an object of the Math class
        obj.printFiboSeries(5);// this is how we execute the logic present inside the methods
        obj.printFiboSeries(10);
        obj.add(5,7);
        obj.printAnyWords('v');
    }
}
