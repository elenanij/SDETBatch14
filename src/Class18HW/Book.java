package Class18HW;

/*Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
        Instance variables are being initialized
        Both Constructors are being executed*/
public class Book {
    String name;
    String genre;
    String sequel;

    public Book(String name, String genre) {
        this.name = name;
        this.genre = genre;
    }
    public Book(String name, String genre, String sequel) {
        this(name, genre);
        this.sequel = sequel;
    }
    public static void main(String[] args) {
        Book hp1 = new Book ("Harry Potter and the Sorcerer's stone", "adventure", "Harry Potter and the chamber of secrets");

        Book pride = new Book("Pride and Prejudice", "Romance");
    }
}
