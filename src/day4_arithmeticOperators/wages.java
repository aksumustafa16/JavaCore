package day4_arithmeticOperators;

//This program calculate hourly wages plus overtime
public class wages {
    public static void main(String[] args) {

        double regularWage; //The calculated regular wage
        double basePay = 25; //The base pay
        double regularHours = 40; //The hours worked less overtime
        double overtimeWages; //Overtime wages
        double overTimePay = 37.5; //Overtime Pay rate
        double overTimeHours = 10;
        double totalWages; //Total wage

        regularWage = basePay * regularHours;
        overtimeWages = overTimePay * overTimeHours;
        totalWages = regularWage + overtimeWages;
        System.out.println("totalWages = " + totalWages);
    }
}
