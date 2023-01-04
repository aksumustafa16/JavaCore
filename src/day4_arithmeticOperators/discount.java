package day4_arithmeticOperators;

public class discount {
    public static void main(String[] args) {
        /**
         * This program calculates the s sale price of an
         * item that is regularly priced at %59 with a 20% discount on it
         */

        int regularPrice = 59;
        double discount;
        double salesPrice;
        discount = regularPrice * 0.2;
        salesPrice= regularPrice-discount;
        System.out.println("regularPrice = " + regularPrice);
        System.out.println("discount = " + discount);
        System.out.println("salesPrice = " + salesPrice);

    }
}
