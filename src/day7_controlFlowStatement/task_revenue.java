package day7_controlFlowStatement;

public class task_revenue {
    public static void main(String[] args) {

        double revenue;
        int price = 500;
        int quantity = 7;

        revenue=price*quantity;

        if (revenue >= 5000) {
            revenue = revenue-(revenue*0.1);

        }
        System.out.println(revenue);
    }
}
