package day8_controlFlowStatement_Part2;

public class SwitchCaseStatement {
    public static void main(String[] args) {

        String weather = "sunny";

        switch (weather) {
            case "sunny":
                System.out.println("Go to park");
                break;
            case "hot":
                System.out.println("Go to swimming");
                break;
            case "windy":
                System.out.println("Fly a kite");
                break;
            case "snwo":
                System.out.println("Go snowboarding");
                break;
            default:
                System.out.println("Code Java in any other weather");
        }
    }
}
