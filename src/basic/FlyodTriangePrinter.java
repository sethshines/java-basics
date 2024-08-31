package basic;

import java.util.Scanner;

// Floyd’s Triangle:
// Print Floyd’s Triangle up to a given number of rows.
public class FlyodTriangePrinter {

    public static void main(String[] args) {
        System.out.println("Please enter the number of rows to print.");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int num = 1;
        for (int i =0; i<rows;i++) {
            int j = i;
            while(j >= 0) {
                System.out.print(num+ " ");
                j--;
                num++;
            }
            System.out.println();
        }
    }
}
