package designpattern.protoytpe;

import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeType){
        Shape shape = shapeMap.get(shapeType);
        return (Shape) shape.clone();
    }

    public static void loadCache(){
        Cricle cricle = new Cricle();
        shapeMap.put(cricle.getType(),cricle);

        Rectangle rectangle = new Rectangle();
        shapeMap.put(rectangle.getType(), rectangle);

        Square square = new Square();
        shapeMap.put(square.getType(), square);
    }

}
