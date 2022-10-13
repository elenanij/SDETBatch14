package Class20HW;
/*Create 1 class in which create a methods that will calculate the area (volume in case of box) of
        Rectangle
        Square
        Box*/
public class Shape {
    int area(int width) {

        System.out.println("The area of the square is "+ width*width);
        return width*width;
    }
    int area(int width, int length) {

        System.out.println("The area of the rectangle is "+ width*length);
        return width*length;
    }
    int area(int width, int length, int height) {

        System.out.println("The area of the box is "+ width*height*length);
        return width*height*length;
    }
}
