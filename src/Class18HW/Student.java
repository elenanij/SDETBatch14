package Class18HW;
/*
Write a Student class that have instance variables name and address. Create a constructor that will initialize those variables.
Print name & address of given  student using displayInfo method.
*/
public class Student {
    String name;
    String address;
    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
    void displayInfo() {
        System.out.println("name " + name + ", address " + address);
    }

    public static void main(String[] args) {

        new Student("John", "1234 Magnolia Lane").displayInfo();

    }
}