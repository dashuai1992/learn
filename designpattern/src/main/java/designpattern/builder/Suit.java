package designpattern.builder;

import java.util.List;

public class Suit {
    private List<Cloth> cloths;

    public Suit(List<Cloth> cloths) {
        this.cloths = cloths;
    }

    public void suitInfo(){
        float totalAmout = 0f;
        StringBuffer info = new StringBuffer();
        for (Cloth cloth :
                cloths) {
            totalAmout+=cloth.getPrice();
            info.append(cloth.getName()).append(" ")
                    .append(cloth.clothType()).append(" ")
                    .append(cloth.material()).append(" ")
                    .append("price: ").append(cloth.getPrice()).append("\n");
        }
        System.out.println("totalAmount: "+totalAmout);
        System.out.println("detail: ");
        System.out.println(info.toString());
    }
}
