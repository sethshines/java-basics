package Recursion;

public class Program3 {
    public static void main(String[] args) {
        sum(200, 0);
    }

    public static void sum(int a, int total) {
        if(a == 0 ){
            System.out.println(total);
            return;
        }
        total += a;
        sum(a-1, total);
    }
}
