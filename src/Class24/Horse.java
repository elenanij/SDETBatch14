package Class24;

public class Horse {

    private String name;
    private String breed;
    private String color;
    private int age;

    public Horse(String name, String breed, String color, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.out.println("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    public String getBreed() {

        return breed;
    }

    public void setBreed(String breed) {
        if (breed.isEmpty() || breed.isBlank()) {

            System.out.println("Breed cannot be empty");
        } else {
            this.breed = breed;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color.isBlank()) {

            System.out.println("Color cannot be empty");
        } else {
            this.color = color;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 50) {

            System.out.println("Please enter a valid age");
        } else {
            this.age = age;
        }
    }
}

class Test {

    public static void main(String[] args) {

        Horse jose = new Horse("Jose", "Shire", "white", 20);

        System.out.println(jose.getName());
        System.out.println(jose.getBreed());
        System.out.println(jose.getColor());
        System.out.println(jose.getAge());

    }
}
