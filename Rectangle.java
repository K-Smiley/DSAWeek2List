package Q2a;

public class Rectangle extends AShape {

    // instance variables
    int length;
    int width;

    
    // constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // implementend method
    public void display() {
        System.out.println("I'm a rectangle. Length: " + " " + length + " " + "Width: " + " " + width);
    }

}

