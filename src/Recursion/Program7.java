package Recursion;

public class Program7 {
    public static void main(String[] args) {
        towerOfHanoi(3, "S", "H", "D");
    }

    public static void towerOfHanoi(int totalDisks, String src, String helper, String dest) {
        if(totalDisks == 1) {
            System.out.println("Transfer disk "+ totalDisks + " from " + src +" to " + dest);
            return;
        }
        towerOfHanoi(totalDisks-1, src, dest, helper);
        System.out.println("Transfer disk "+ totalDisks + " from " + src +" to " + dest);
        towerOfHanoi(totalDisks-1, helper, src, dest);
    }
}
