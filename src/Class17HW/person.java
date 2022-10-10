package Class17HW;
/*Write a java class that have 4 constructors with 4 different access levels of constructors(private,public,default,protected)
and create 4 objects of this class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
 and observe result.*/
public class person {
    private String name;
    private int age;
    private person(String name, int age) {
        this.name = name;
        this.age = age;
    }
     public person(String name) {
        this.name = name;
    }
     person(int age) {
        this.age = age;
    }
    protected person() {
    }

    public static void main(String[] args) {
        person obj1 = new person("James",24); //private from same class
        person obj2 = new person("James"); //public from same class
        person obj3 = new person(24); //default from same class
        person obj4 = new person(); //protected from the same class
    }
}
