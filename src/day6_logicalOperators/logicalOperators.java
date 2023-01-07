package day6_logicalOperators;

public class logicalOperators {
    public static void main(String[] args) {

        char c1 = 'A';
        char c2 = 65;
        int i1 = 5;
        int i2 = 10;



        boolean res1 = (i1==i2)&(c1==c2);
        boolean res2 = (i1==i2)&&(c1==c2);
        System.out.println("res1 = " + res1);   //false
        System.out.println("res2 = " + res2);   //false

        boolean res3 = (c1==c2)|(i1==i2);   //true
        boolean res4 = (c1==c2)||(i1==i2);  //true
        System.out.println("res3 = " + res3);
        System.out.println("res4 = " + res4);
    }
}
