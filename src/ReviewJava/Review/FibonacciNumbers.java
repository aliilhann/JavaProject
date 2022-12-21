package ReviewJava.Review;

import java.util.LinkedList;

public class FibonacciNumbers {
    public static void main(String[] args)
    {
        int numBefore = 0;

        LinkedList<Integer> fibonacciSequence = new LinkedList<>();

        for (int i = 0; i < 10; i++)
        {
            fibonacciSequence.add(fibonacci(i));
        }

        while(!fibonacciSequence.isEmpty())
        {
            System.out.print(fibonacciSequence.remove() + " ");
        }
    }

    public static int fibonacci (int number)
    {
        if(number == 0)
        {
            return 0;
        }
        if(number == 1 || number == 2){
            return 1;
        }

        return fibonacci(number-2) + fibonacci(number-1);
    }
}
