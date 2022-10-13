package Class21HW;

public class TestDegree {

    public static void main(String[] args) {
        Degree bachObj = new Degree();
        Degree mastersObj = new Masters();
        Degree degreeObj = new Bachelors();

        degreeObj.getPrerequisite();
        bachObj.getPrerequisite();
        mastersObj.getPrerequisite();
    }
}
