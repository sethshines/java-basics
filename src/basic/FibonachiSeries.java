package basic;

import java.util.Scanner;

public class FibonachiSeries {
    public static void main(String[] args) {
        System.out.println("Please enter the number to print FIB to.");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        fibonachi(number);
    }

    static void fibonachi(int number) {
        int sum = 0;
        int a = 0;
        int b = 1;
        while(sum < number) {
            System.out.print(sum + " ");
            sum = a + b;
            a = b;
            b = sum;
        }
    }
}
