package designpattern.protoytpe;

public class Rectangle extends Shape {
    public Rectangle() {
        type = "rectangle";
    }

    void draw() {
        System.out.println("Inside rectangle :: draw() method");
    }
}
