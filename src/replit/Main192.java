package replit;

import java.util.LinkedList;

class Main192 {

    static boolean prime(int num) {

        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {

                isPrime = false;
                break;
            }
        }
        return isPrime;

    }

    public static void main(String[] args) {

        LinkedList<Integer> allPrime = new LinkedList<>();

        for (int i = 1; i <= 100; i++) {

            if (i == 1) {
                continue;
            }

            else if (prime(i)) {

                allPrime.add(i);
            }

        }

        System.out.println(allPrime);
    }

}
