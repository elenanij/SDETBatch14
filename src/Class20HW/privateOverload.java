package Class20HW;
/*Create 1 class with a private method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.*/
public class privateOverload {
    private void test(String food, int quantity) {
        System.out.println(food+ " " + quantity);
    }
    private void test(String food, String drink, int quantity) {
        System.out.println(food+ " " + quantity+ "," + drink+ " "+ quantity);
    }
    private void test(String drink,boolean iced, int quantity) {

        System.out.println(drink+ " " + quantity + " "+ iced);
    }
    public static void main(String[] args) {

        privateOverload order1 = new privateOverload();
        privateOverload order2 = new privateOverload();
        privateOverload order3 = new privateOverload();

        order1.test("Pizza", 2);
        order2.test("Pasta", "Wine", 3);
        order3.test("Latte", true, 2);
    }
}

