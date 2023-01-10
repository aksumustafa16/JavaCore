package day7_controlFlowStatement;

public class task_goodMorning {
    public static void main(String[] args) {

        int hours = 9;

        if (hours < 12) {
            System.out.println("Good morning");
        }
        if (hours >= 12 && hours < 15) {
            System.out.println("Good afternoon");
        }
        if (hours > 15) {
            System.out.println("Good evening");
        }
    }
}
