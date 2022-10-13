package replit;

class Person {
    String name;
    String lastName;
    int age;

}
class Employee extends Person {

    int salary;

    void printInfo(String name, String lastName, int age, int salary) {

this.name = name;
this.lastName = lastName;
this.age = age;
this.salary = salary;

        System.out.println(name + " "+ lastName+ " "+ age + " "+ salary);
    }
}
class Student extends Employee{

    int grade;

    void printInfo(String name, String lastName, int age, int grade) {

        this.grade = grade;
        this.name = name;
        this.lastName = lastName;
        this.age = age;

        System.out.println(name + " "+ lastName+ " "+ age + " "+ grade);
    }
}

class Retiree extends Student {

    String seniorActivity ;

    void printInfo(String name, String lastName, int age, String seniorActivity) {

        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.seniorActivity = seniorActivity;

        System.out.println( name + " "+  lastName+ " " +  age + " "+  seniorActivity);

    }
}


public class Main {

    public static void main (String[]args){

        Employee empObj = new Employee();
        empObj.printInfo("Joe", "Smith", 35, 35000);


        Student stuObj = new Student();
        stuObj.printInfo("Adam", "Smith", 15, 10);


        Retiree retObj = new Retiree();
        retObj.printInfo("Frank", "Smith", 15, "tour");
    }

}
