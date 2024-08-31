package basic;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] args) {
        System.out.println("Please enter number of Hours!");
        Scanner scan  = new Scanner(System.in);
        long hours = scan.nextLong();
        System.out.println("Please enter pay rate");
        var payRate = scan.nextFloat();
        var total = hours * payRate;
        System.out.println("Gross Pay: "+total);
    }
}
