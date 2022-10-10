package Class17HW;

public class student {
    /*Write a java Class Students that have a constructor which takes students name and 3 subject grades.
        Inside your class also have a method to Calculate Average Grade. Test Student class for 5 different students with different marks.
        Your program should print an average mark of each student's name.*/
    String name;
    private int mathGrade;
    private int scienceGrade;
    private int englishGrade;
    public student(String studentName, int studMathGrade, int studScienceGrade, int studEnglishGrade) {
        name = studentName;
        mathGrade = studMathGrade;
        scienceGrade = studScienceGrade;
        englishGrade = studEnglishGrade;
    }
    int averageGrade() {
        return (mathGrade + scienceGrade + englishGrade) / 3;
    }

}
