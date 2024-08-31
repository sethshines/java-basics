package basic;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        System.out.println("Please enter number to calculate factorial.");
        Scanner scan = new Scanner(System.in);
        System.out.println(factorial(scan.nextInt()));
        scan.close();
    }

    public static int factorial(int num) {
        if(num == 0) {
            return 1;
        }

        return num * factorial( num - 1);
    }
}


