package designpattern.protoytpe;

public class Square extends Shape {

    public Square() {
        type = "square";
    }

    void draw() {
        System.out.println("Inside square :: draw() method");
    }
}
