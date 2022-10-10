package Class17HW;

public class personTest {
    public static void main(String[] args) {


        //person obj1 = new person("James", 24); //private - no access from outside class

        person obj2 = new person("James"); //public from outside class

        person obj3 = new person(24); //default from outside class

        person obj4 = new person(); //protected from outside class

    }

}