package Class14HW;

public class Task1 {
    //Create a method that will take 2 parameters as a numbers and prints which number is larger.
    static void larger(int num1, int num2) {

        if (num1 > num2) {

            System.out.println(num1 + " is larger than " + num2);

        } else if (num2 > num1) {
            System.out.println(num2 + " is larger than " + num1);
        } else {
            System.out.println("Numbers are equal");
        }
    }

    public static void main(String[] args) {

        larger(1, 2);
        larger(9, 9);
        larger(10, 6);
    }
}
