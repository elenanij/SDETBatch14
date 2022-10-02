package Class14HW;

public class student {
  /*  Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
    score > 90 - A, score >80 - B, score >70 - C, score > 50 - D, anything else - F*/
    char getGrade(int score) {
        char grade;

        if (score > 90) {
            grade = 'A';
        } else if (score > 80) {
            grade = 'B';
        } else if (score > 70) {
            grade = 'C';
        } else if (score > 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        return (grade);
    }

    public static void main(String[] args) {

        student obj1 = new student();
        char grade1 = obj1.getGrade(95);
        System.out.println("grade1 = " + grade1);
        char grade2 = obj1.getGrade(70);
        System.out.println("grade2 = " + grade2);
        char grade3 = obj1.getGrade(10);
        System.out.println("grade3 = " + grade3);
    }
}
