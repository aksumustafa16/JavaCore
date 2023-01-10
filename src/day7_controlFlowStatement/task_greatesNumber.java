package day7_controlFlowStatement;

public class task_greatesNumber {
    public static void main(String[] args) {

        int num1 = 13;
        int num2 = 34;
        int num3 = 45;

        if (num1 > num2 && num1>num3) {
            System.out.println("The greater number is: " + num1);
        }
        if (num2>num1 && num2>num3){
            System.out.println("The greater number is: " + num2);
        }
        if (num3>num1 && num3>num2){
            System.out.println("The greater number is: " + num3);
        }
    }
}
