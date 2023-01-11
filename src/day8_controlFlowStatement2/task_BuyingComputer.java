package day8_controlFlowStatement2;

public class task_BuyingComputer {
    public static void main(String[] args) {

       String computer="Dell";

       switch (computer){
           case "Apple":
               System.out.println("Apple-no virus");
               break;
           case "Dell":
               System.out.println("Tough one");
               break;
           case "Acer":
               System.out.println("No recommended");
               break;
           default:
               System.out.println("Do not buy that one");
       }
    }
}
