package Recursion;

public class Program8 {
    public static void main(String[] args) {
        printStrRev("RAHUL", 4);
    }

    public static void printStrRev(String str, int indexToPrint) {
        if(indexToPrint == -1) {
            return;
        }
        System.out.print(str.charAt(indexToPrint));
        printStrRev(str, indexToPrint - 1);
    }
}
