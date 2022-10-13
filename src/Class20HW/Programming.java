package Class20HW;
/*
Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
then the message "I love programming languages" should be printed.
If some String is passed to it, then in place of "programming languages" the value variable should be printed.
Example, if we pass "Java", then "I love Java" should be printed.
*/
public class Programming {
    String language;

    Programming() {

        System.out.println("I love Programming languages");
    }

    Programming(String language){

        this.language = language;
        System.out.println("I love "+ language);

    }
}
