package Class16HW;

//Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
// Method should be available inside the class only where it was declared and executed by calling it is name.

public class vowelsOnly {

    private static String vowels(String str) {

        String strVowels = str.replaceAll("^AEIOUaeiou", "");

        return strVowels;

}


}
