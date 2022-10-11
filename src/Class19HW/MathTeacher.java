package Class19HW;
/*Write a Java program called Teacher.Identify features and behaviour of that Class.
        Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
        Test all 4 classes*/

public class MathTeacher extends Teacher {
    MathTeacher(String name, char gender, boolean nice) {
        super(name, gender, nice);
    }
}
    class ChemistryTeacher extends Teacher {
         ChemistryTeacher(String name, char gender, boolean nice) {
             super(name, gender, nice);
         }
    }

class PianoTeacher extends Teacher {

    PianoTeacher(String name, char gender, boolean nice) {
        super(name, gender, nice);
    }
}

