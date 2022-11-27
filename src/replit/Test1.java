package replit;

import java.util.ArrayList;
import java.util.List;

public class Test1 {


    static void gradeCheck(int grade) throws SyntaxStudentException {
        if (grade > 90) {

            throw new SyntaxStudentException("SyntaxStudentException: You are an exceptionally awesome student");

        } else {

            System.out.println("You are a great student");
        }

    }


    public static void main(String[] args) {

        try {

            gradeCheck(95);
        } catch (SyntaxStudentException e) {

            System.out.println(e);

        }

    }
}


      class SyntaxStudentException extends Exception{

             SyntaxStudentException(String errorMessage) {

                 super(errorMessage);

                 List<Integer> arr = new ArrayList<>();

             }


    }




