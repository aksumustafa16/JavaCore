package day9_controlFlowStatement_Part3;

public class TrafficLightSelector {
    public static void main(String[] args) {

        char color = 'r';

        switch (color){
            case 'r': case 'R':
                System.out.println("Red Light");
                break;
            case 'o': case 'O':
                System.out.println("Orange Light");
                break;
            case 'g': case 'G':
                System.out.println("Green Light");
                break;
            default:
                System.out.println("Wrong Selector");
        }
    }
}
