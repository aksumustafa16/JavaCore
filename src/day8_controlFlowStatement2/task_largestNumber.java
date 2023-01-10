package day8_controlFlowStatement2;

public class task_largestNumber {
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;
        int num3 = 300;

        if (num1 > num2 && num1 > num3) {
            System.out.println("Num1 is greatest one");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Num2 is greatest one");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Num3 is greatest one");
        }else{
            System.out.println("Numbers is equal");
        }
    }
}
