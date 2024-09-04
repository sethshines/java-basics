package Recursion;

public class Program2 {
    public static void main(String[] args) {
        printMe(1);
    }

    public static void printMe(int a) {
        if(a > 5) {
            return;
        }
        System.out.println(a);
        printMe(a+1);
    }
}
