package day8_controlFlowStatement2;

public class Calculator {
    public static void main(String[] args) {

        char sign = '+';
        int num1 = 22;
        int num2 = 12;

        switch (sign){
            case 'x':
                System.out.println(num1*num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '+':
                System.out.println(num1+num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
