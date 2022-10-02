package Class14HW;

public class isPrime {
//Write a method to return whether given number is prime or not?
    void prime(int num) {

        boolean isPr = true;
        if (num == 0 || num == 10) {
            System.out.println(num + " is not a prime number");
        }

        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime number");
                    isPr = false;
                    break;
                }
            }
            if (isPr) {
                System.out.println(num + " is a prime number");
            }
        }
    }

        public static void main (String[]args){
            isPrime obj = new isPrime();
            obj.prime(9);
            obj.prime(11);
        }
    }

