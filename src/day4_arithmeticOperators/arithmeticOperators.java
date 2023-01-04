package day4_arithmeticOperators;

public class arithmeticOperators {
    public static void main(String[] args) {
        //Addition Operator +
        System.out.println("55+5");
        int chairs = 140;
        System.out.println(chairs+2);

        int moreChairs = chairs + 5;
        System.out.println("moreChairs = " + moreChairs);

        int tables = 130;
        int total =  tables + chairs;

        System.out.println("total = " + total);

        //Subtraction -
        double balance = 1200.50;
        double transaction = 56.44;
        System.out.println(balance-transaction);
        balance = balance - transaction;
        System.out.println(balance);
        
        //Create a variables linesOfCode and assign 50 and print "Lines of code 50"
        //delete 2 lines
        //decrease the value of linesOfCode by 2 and print "lines of Code 48"
        
        int linesOfCode = 50;
        System.out.println(linesOfCode);
        System.out.println("linesOfCode = " + linesOfCode);

        linesOfCode = linesOfCode-2;
        System.out.println("linesOfCode = " + linesOfCode);

        //Multiplication *
        System.out.println(22*2);

        int classes = 5;
        System.out.println(linesOfCode*classes);
        int totalLinesOfCode = linesOfCode*classes;
        System.out.println("totalLinesOfCode = " + totalLinesOfCode);

        //Division
        System.out.println(10/2);
        System.out.println(60/3);

        //System.out.println(11/0); //Throw error while running the code

        //Remainder %
        System.out.println(10%2);
        System.out.println(9%2);

        
        


    }
}
