package designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class SuitBuilder {
    public Suit buildFationSuit(){
        List<Cloth> cloths = new ArrayList<Cloth>();
        cloths.add(new Skirt("adidas",299.00f));
        cloths.add(new Tshirt("lining", 599.00f));
        return new Suit(cloths);
    }

    public Suit buildFormalSuit(){
        List<Cloth> cloths = new ArrayList<Cloth>();
        cloths.add(new Skirt("ua",319.00f));
        cloths.add(new Tshirt("tebu", 99.00f));
        return new Suit(cloths);
    }

    class Skirt extends Cloth{

        public Skirt(String name, float price) {
            super(name, price);
        }

        public String clothType() {
            return "skirt";
        }

        public String material() {
            return "cotton";
        }
    }

    class Tshirt extends Cloth {

        public Tshirt(String name, float price) {
            super(name, price);
        }

        public String clothType() {
            return "T-shirt";
        }

        public String material() {
            return "dacron";
        }
    }

}
