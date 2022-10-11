package Class19HW;

public class A {
    static void meth1() {

        System.out.print("Hello there");
    }
}
class B extends A {
    static void meth2() {
        meth1();
        System.out.println(" Asghar");
    }
}

class C extends B {

    public static void main(String[] args) {
        meth2();
    }

}
