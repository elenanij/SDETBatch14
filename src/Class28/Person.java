package Class28;

/*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.*/

import java.util.TreeMap;

public class Person {

    String name;
    String lastName;
    int age;
    double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    void printUserDetails() {

        System.out.println("name: "+ name + ", lastname: "+ lastName +", age: "+ age +", salary: " + salary);
    }
}

class Test {

    public static void main(String[] args) {

        TreeMap <Integer, Person> directory = new TreeMap<>();

        directory.put(1, new Person("John", "Smith", 28, 140000));
        directory.put(2, new Person("Alison", "Jones", 34, 155000));
        directory.put(3, new Person("Michael", "Scott", 45, 60000));
        directory.put(4, new Person("Jim", "Halpert", 23, 85000));
        directory.put(5, new Person("Pam", "Beasley", 23, 50000));

        for (Person personObj: directory.values()) {

            personObj.printUserDetails();
        }
    }
}