package designpattern.protoytpe;

/*
 * @Auther Swit
 * @Date 2018/7/24
 */
public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape rectangle = ShapeCache.getShape("rectangle");
        System.out.println("shape:" + rectangle.getType());

        Shape cricle = ShapeCache.getShape("cricle");
        System.out.println("shape:" + cricle.getType());

        Shape square = ShapeCache.getShape("square");
        System.out.println("shape:" + square.getType());
    }
}
