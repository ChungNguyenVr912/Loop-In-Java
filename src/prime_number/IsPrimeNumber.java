package prime_number;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();
        if(number < 2){
            System.out.println(number+ " is not a prime");
        }else {
            boolean check = true;
            int i = 2;
            while(i < number){
                if(number % i == 0){
                    check =  false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println(number + " is a prime");
            }else {
                System.out.println(number + " is not a prime");
            }
        }
    }
}
