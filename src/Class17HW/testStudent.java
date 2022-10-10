package Class17HW;

public class testStudent {

    public static void main(String[] args) {
        student john = new student("John", 80, 92, 75);
        System.out.println(john.name + " " + john.averageGrade());

        student ashley = new student("Ashley", 100, 95, 93);
        System.out.println(ashley.name + " " + ashley.averageGrade());

        student peter = new student("Peter", 53, 64, 79);
        System.out.println(peter.name + " " + peter.averageGrade());

        student jill = new student("Jill", 85, 82, 97);
        System.out.println(jill.name + " " + jill.averageGrade());

        student hunter = new student("Hunter", 55, 78, 86);
        System.out.println(hunter.name + " " + hunter.averageGrade());
    }
}
