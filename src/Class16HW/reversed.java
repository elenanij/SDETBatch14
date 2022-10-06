package Class16HW;

//Create a method that will take a String as a parameter and returns reversed String.
// Method should be available to all classes within your project and accessible by class name.

public class reversed {

    public static String reversed(String str) {

        StringBuilder str1 = new StringBuilder(str);
        str1.reverse();
        str = str1.toString();

       return str;

   }

}
