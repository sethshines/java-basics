package basic;

import java.util.Scanner;
// Multiplication Table:
// Write a program that prints the multiplication table of a given number.
public class MultiplicationTable {

    public static void main(String[] args) {
        System.out.println("Please enter a number to print its multiplication Table.");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int num = 0;
        while(num < 11) {
            System.out.println(number + " * " +num + " = " + (num * number));
            num++;
        }
    }
}

