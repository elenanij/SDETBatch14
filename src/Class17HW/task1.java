package Class17HW;

public class task1 {
//    Write a java class that will have a constructor: one with parameters and second without any parameters.
//    Create a separate Test class where you will execute both of the constructors 1 by 1.
    private String name;
    private int age;
    private String gender;

   public task1(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
       System.out.println(name +" " + age + " "+ gender);
    }
    task1() {
        System.out.println("No parameters here");
    }
}
 class task1Test {

     public static void main(String[] args) {

         task1 obj = new task1();
         task1 obj2 = new task1("Tom", 2, "male");

     }
}
