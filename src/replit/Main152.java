package replit;

public class Main152 {

        public static void main(String[]args) {

            Child obj1 = new Child("Vienna");

        }

    }

class Parent {

    Parent(String city) {

        System.out.println(city);

    }

    Parent() {

        System.out.println("Parent Constructor");
    }
}


    class Child extends Parent {

        Child(String city) {
        super(city);
        }
        }

