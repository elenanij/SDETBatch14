package Class14HW;

public class isEven {
    //Create a method that will take a number and prints whether the number is even or odd.

    void check (int num) {
        if(num%2==0)
        System.out.println("The number is even");

        else {

            System.out.println("The number is odd");
        }
    }

    public static void main(String[] args) {
        isEven obj = new isEven();
        obj.check(3);
        obj.check(10);
    }
}
