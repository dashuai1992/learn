package designpattern.builder;

public class Main {

    /*
    *
    * */

    public static void main(String[] args) {
        SuitBuilder suitBuilder = new SuitBuilder();
        Suit fationSuit = suitBuilder.buildFationSuit();
        Suit formalSuit = suitBuilder.buildFormalSuit();

        fationSuit.suitInfo();
        formalSuit.suitInfo();

    }
}
