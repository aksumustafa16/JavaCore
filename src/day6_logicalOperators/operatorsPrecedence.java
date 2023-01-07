package day6_logicalOperators;

public class operatorsPrecedence {
    public static void main(String[] args) {

        int applesCount = 20;
        int orangesCount = 30;
        int pearsCount = 30;

        boolean comp = applesCount<orangesCount||orangesCount>=pearsCount;
        System.out.println("comp = " + comp);

        System.out.println("*******************************");

        String outsideWeather;
        int degree;
        outsideWeather = "Shinny";
        degree = 70;

        boolean comp2 = (!(outsideWeather=="Rainy"||degree==70));
        System.out.println("comp2 = " + comp2);

        System.out.println("*****************************");


        int b = 2;
        boolean res = ++b ==2 || --b == 2 && --b == 2;
        System.out.println("res = " + res);

        System.out.println("*******************************");

        boolean x = true, z = true;
        int y = 20;
        x = (y!=10)||(z=false);
        System.out.println("x = " + x);
    }
}
