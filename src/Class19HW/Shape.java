package Class19HW;

//Write program: Shape class has a constructor that takes the radius and has a subclass as circle class.
// In circle class create a method to calculate the area of circle. Test your code

public class Shape {
    int radius;

    Shape(int radius) {

        this.radius = radius;
    }
}

class ShapeTester {

    public static void main(String[] args) {

        System.out.println(new Circle(2).area());

    }
}