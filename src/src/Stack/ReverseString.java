package Stack;

import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseString {

    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int index = 0;

        // push chars to stack
        while (index < str.length()) {
            s.push(str.charAt(index));
            index++;
        }

        // pop chars to reverse
        StringBuilder rev = new StringBuilder("");

        while (!s.isEmpty()) {
            rev.append(s.pop());
        }
        return rev.toString();
    }

    public static void main(String args[]) {
        String s = "abc";
        String st = reverse(s);
        System.out.println(st);
    }
}
