package Recursion;

public class Program9 {
    public static void main(String[] args) {
        int first = -1;
        int last = -1;
        printStrRev("abaacdaefaah", 'f',first, last, 0);
    }

    public static void printStrRev(String str, char a,int f, int l, int currentIndex) {
        if(currentIndex == str.length() - 1) {
            System.out.println("First " + f + " Last "+ l);
            return;
        }

        if(str.charAt(currentIndex) == a) {
            if(f == -1) {
                f=currentIndex;
            }
            l=currentIndex;
        }

        printStrRev(str, a, f,l,currentIndex+1);
    }
}
