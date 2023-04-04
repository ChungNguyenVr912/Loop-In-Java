package InterestCalculator;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double money = scanner.nextDouble();
        System.out.print("Enter number of months: ");
        int month = scanner.nextInt();
        System.out.print("Enter interest rate in percent: ");
        double interestRate = scanner.nextDouble();
        double totalMoney = money;
        double totalInterest;
        for(int i = 0; i< month; i++){
            totalMoney += totalMoney*(interestRate/12/100);
        }
        totalInterest = totalMoney - money;
        System.out.printf("Total interest after %d months: %.2f", month, totalInterest);
    }
}
