package Recursion;

public class PrintKeypad {

    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printCombination(String s, int index, String combination)
    {
        if(index == s.length())
        {
            System.out.println(combination);
            return;
        }
        // Extract curr char from given string
        char currChar = s.charAt(index);

        // Map the currchar into keypad array to get particular string
        String mapping = keypad[currChar - '0'];

        // Loop into the obtained string from keypad
        for(int i=0;i<mapping.length();i++)
        {
            // Go to next level of index by fetching next char from given string and make combinations
            printCombination(s, index+1, combination+mapping.charAt(i));
        }

    }
    public static void main(String[] args) {
        String s = "23";

        printCombination(s, 0, "");
    }
}
