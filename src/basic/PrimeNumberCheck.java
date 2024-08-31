package basic;

import java.util.Scanner;
// Prime Number Check: Write a program to check if a given number is prime.
public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println("Please enter a number to check if prime or not.");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean isPrime = false;
        for(int i=2;i< number;i++) {
         if(number % i == 0){
             isPrime = true;
             break;
         }
        }
        System.out.println(isPrime);
    }
}
