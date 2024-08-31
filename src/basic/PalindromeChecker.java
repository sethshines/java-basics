package basic;

import java.util.Scanner;

// Palindrome Checker:
// Create a program to check if a given string or number is a palindrome.
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number or a string");
        var input = scan.nextLine();
        input = input.trim();
        boolean isPalindrome = true;
        int length = input.length() % 2 == 0 ? input.length() / 2 : (input.length() + 1)  / 2;
        for (int i=0;i<length;i++) {
            if(input.charAt(i) != input.charAt((input.length()-1) - i)){
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
