package day9_controlFlowStatement_Part3;

public class OrLogicWithSwitch {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade){
            case 'A': case 'B': case 'C':
                System.out.println("pass");
                break;
            case 'D': case 'E':
                System.out.println("fail");
                break;
        }
    }
}
