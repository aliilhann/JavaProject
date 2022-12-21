package ReviewJava.Review;

import java.util.LinkedList;

public interface canFly {
    int amount = 10;
    public static void eatGrass() {
    }
}class Main {
        static void checkForPrime() {
            boolean isPrime = true;
            int num = 0;
            if (num > 1) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                isPrime = false;
            }
            if (isPrime) {
                System.out.println(num + " is Prime");
            } else {
                System.out.println(num + " is not Prime");
            }
        }

        public static void main(String[] args) {
            LinkedList<Integer> nums = new LinkedList<>();

            for (int i = 0; i < 100; i++) {
          // if(checkForPrime(i))

                System.out.println(nums);
            }
        } }