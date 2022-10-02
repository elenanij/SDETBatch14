package Class14HW;
import java.util.Scanner;
public class hello {
    //Create a method that will say Hello in different language based on the country that was passed when method is executed
    void language(String country) {
        Scanner scan = new Scanner(System.in);
         country = scan.nextLine();
        switch (country) {
            case "Burkina Faso":
                System.out.println("Bonjour");
                break;

            case "Egypt":
                System.out.println("مرحبًا");
                break;

            case "Belarus":
                System.out.println("Прывітанне");
                break;

            case "Greece":
                System.out.println("γεια σας");
                break;

            default:
                System.out.println("No such country found");
        }
    }

    public static void main(String[] args) {
        hello obj = new hello();
        String country = null;
        obj.language(country);

    }
}
