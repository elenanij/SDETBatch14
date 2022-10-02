package Class14HW;

public class isPalindrome {
    //Create a method that will print whether given String is palindrome or not.
    void isPal(String str) {

        String str1 = str.toLowerCase().replace(" ", "");
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        if (sb.toString().equals(str1)) {

            System.out.println("\"" + str + "\"" + " is a palindrome");

        } else {
            System.out.println("\"" + str + "\"" + " is not a palindrome");
        }
    }

    public static void main(String[] args) {

        isPalindrome obj1 = new isPalindrome();
        obj1.isPal("Was it a cat I saw");
        obj1.isPal("monkey");
    }


}
