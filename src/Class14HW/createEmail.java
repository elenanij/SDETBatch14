package Class14HW;

public class createEmail {
/*
    Create a method createEmail(). Based on values of users name, lastName and email type, your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
*/
    String emailGen (String firstName, String lastName, String type) {

        String email = firstName.concat(lastName +"@" +".com").toLowerCase();

        return email;
    }

    public static void main(String[] args) {

        createEmail obj = new createEmail();
        String addressJS = obj.emailGen("John", "Smith", "gmail");
        System.out.println("addressJS = " + addressJS);
        String addressAN = obj.emailGen("Alena", "Nizhnik", "outlook");
        System.out.println("addressAN = " + addressAN);

    }
}
