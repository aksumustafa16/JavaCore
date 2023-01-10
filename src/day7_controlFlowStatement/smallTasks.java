package day7_controlFlowStatement;

public class smallTasks {
    public static void main(String[] args) {

        int x;
        int y = 10;

        if (y == 20) {
            x=5;
            System.out.println(x);
        }

        int hours = 31;
        double payRate = 1.5;

        if (hours > 40) {
            System.out.println("Payrate is: " + hours*payRate);
        }

        int fees;
        boolean max = false;

        if (max) {
            System.out.println("fees");
        }

        int a;
        int b = 40;
        int c = 100;
        if (b==50&&c==100) {
            System.out.println("a = " + 20);
        }

        int temp = 69;
        if (temp >= 70 && temp < 80) {
            System.out.println("Ideal Temp");
        }
    }
}
