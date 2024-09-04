package Recursion;

public class Program5 {
    public static void main(String[] args) {
        fib( 0, 1,35);
    }

    public static void fib(int prev, int prev2, int end) {
        int next  = prev + prev2;
        if(next > end) {
            return;
        }

        System.out.println(next);
        fib(prev2, next, end);
    }
}
