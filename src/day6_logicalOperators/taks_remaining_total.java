package day6_logicalOperators;

public class taks_remaining_total {
    public static void main(String[] args) {

        double d1 = 20;
        double d2 = 80;

        double res = (d1+d2)*25;
        System.out.println("res = " + res);

        double remainder = res%40;

        System.out.println("remainder = " + remainder);

        System.out.println("Remaining total is equal to 20 or less?" + (remainder<=20));

    }
}
