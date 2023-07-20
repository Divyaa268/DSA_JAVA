package Recursion;

public class BinaryStrings {

    public static void printBinString(int n, int lastPlace, String s)
    {
        if(n == 0)
        {
            System.out.println(s);
            return;
        }

        printBinString(n-1, 0, s+"0");

        if(lastPlace == 0)
        {
            printBinString(n-1, 1, s+"1");
        }
    }

    public static void main(String[] args) {

        printBinString(3, 0, "");
    }
}
