package Recursion;

public class Program1 {
    public static void main(String[] args) {
        printMe(5);
    }

    public static void printMe(int a) {
        if(a < 0) {
            return;
        }
        System.out.println(a);
        printMe(a-1);
    }
}
