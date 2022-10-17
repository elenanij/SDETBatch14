package Class22HW;
/*Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes. Define some methods specific to child classes.
 Write example of achieving run time polymorphism*/

public class Student {
    void write() {
        System.out.println("Completing written assignments");
    }
    void sleep() {
        System.out.println("Time to rest");
    }
    void party() {
        System.out.println("Time to party");
    }
}
class SyntaxStudent extends Student {
    @Override
    void write() {
        System.out.println("Writing code");
    }
    @Override
    void party() {
        System.out.println("Time to solve repls");
    }
    void funny() {
        System.out.println("Share GIFs");
    }
}
class CollegeStudent extends Student {
    @Override
    void sleep() {
        System.out.println("We never sleep");
    }
    void getDiploma() {
        System.out.println("Get the degree");
    }
}
class SchoolStudent extends Student {
    @Override
    void write() {

        System.out.println("Writing personal essays for colleges");
    }
    void uniform() {
        System.out.println("Some schools have uniform");
    }
}
class Test {
    public static void main(String[] args) {
        Student[] arr = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for(Student obj: arr) {

            obj.party();
            obj.write();
            obj.sleep();
            System.out.println("*************");
        }
    }

}
