package Class20HW;
/*
Create 1 class with a static method that has 3 overloaded forms. Then call each overloaded method with specific arguments and observe result.
*/
public class staticOverload {
    static void test (int a, String str) {

        System.out.println(str+a);
    }
    static void test (int a, int b, String str) {

        System.out.println(str+a+b);
    }
    static void test (String str, int a) {

        System.out.println(str+a);
    }
    public static void main(String[] args) {
        test(3, "Java");
        test(14, 5, "Selenium");
        test("GitHub", 12);
    }
}


