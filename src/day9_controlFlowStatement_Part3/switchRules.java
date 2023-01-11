package day9_controlFlowStatement_Part3;

public class switchRules {
    public static void main(String[] args) {

        String lastName = "Smith";
        String firstName = "Mike";
        int id = 0;

        switch (firstName){
            case "Test":
                System.out.println("Test");
                break;
            case "lastName":
                id=5;
                break;
//            case 5:
//                break;
        }
    }
}
