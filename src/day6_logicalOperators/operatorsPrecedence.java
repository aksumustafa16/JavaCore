package day6_logicalOperators;

public class operatorsPrecedence {
    public static void main(String[] args) {

        int applesCount = 20;
        int orangesCount = 30;
        int pearsCount = 30;

        boolean comp = applesCount<orangesCount||orangesCount>=pearsCount;
        System.out.println("comp = " + comp);
    }
}
