package Q2a;

public class Square extends AShape {

    // instance variable
    int length;

    
    // constructor
    public Square(int length) {
        this.length = length;

    }

    // implemented method
    public void display() {
        System.out.println("I'm a square and my length is " + " " + length);
    }

}


