package day10_controlFlowStatements_Part4;

public class SumOfEvenAndOddNumbers {
    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;

        for (int i=1;i<=100;i++){

            if(i%2==0){
                sumEven = sumEven + i;
            }else{
                sumOdd = sumOdd + i;
            }
        }
        System.out.println(sumEven+"\n"+sumOdd);
        System.out.println(sumEven + sumOdd);
    }
}
