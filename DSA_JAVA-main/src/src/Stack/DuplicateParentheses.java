package Stack;

import java.util.Stack;

public class DuplicateParentheses {

    public static boolean duplicatePara(String s)
    {
        Stack<Character> stack = new Stack<>();
        int l = s.length();

        for(int i = 0;i<l;i++)
        {
            char c = s.charAt(i);
            if(c == ')')
            {
                int count = 0;
                while(stack.peek() != '(') // check is pair exists
                {
                    stack.pop();
                    count++;
                }
                if(count < 1)
                {
                    return true; // duplicate
                }
                else
                {
                    stack.pop();
                }
            }
            else
            {
                stack.push(c);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "(a+b)";
        System.out.println(duplicatePara(s));

    }
}
