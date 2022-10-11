package Class19HW;
/*
Write a Java program called Teacher.
Identify features and behaviour of that Class.Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
Test all 4 classes
*/
public class Teacher {
    String name;
    char gender;
    boolean nice;
   void printInfo() {
       System.out.println("name: "+ name+", m/f: "+ gender+", nice?: "+ nice);
   }
    public Teacher(String name, char gender, boolean nice) {
        this.name = name;
        this.gender = gender;
        this.nice = nice;
    }
}
class Tester {

    public static void main(String[] args) {

        new MathTeacher("Tatiana", 'F', true).printInfo();
        new ChemistryTeacher("Olga", 'F', false).printInfo();
        new PianoTeacher("Tom", 'M', true).printInfo();
    }
}