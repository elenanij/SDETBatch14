package Class19HW;

public class Circle extends Shape {

    Circle(int radius) {
        super(radius);
    }

    double area() {
        return Math.PI * Math.pow(radius, 2);

    }
}
