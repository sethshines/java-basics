package basic;

import java.util.Scanner;

public class SeasonFill {
    public static void main(String[] args) {
        System.out.println("Please enter season!");
        Scanner scan  = new Scanner(System.in);
        String season = scan.next();
        System.out.println("Please enter adjective");
        String adjective = scan.next();
        System.out.println("Please enter whole number");
        int drinks = scan.nextInt();
        System.out.println("On a "+ adjective + " " + season + " day, I drink a minimum of " + drinks + " cups of coffee.");
        scan.close();
    }
}
