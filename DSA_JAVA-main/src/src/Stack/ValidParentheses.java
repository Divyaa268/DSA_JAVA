package Stack;

import java.util.Stack;

public class ValidParentheses {

    public static boolean validPara(String s)
    {
        Stack<Character> stack = new Stack<>();
        int l = s.length();

        for(int i =0;i<l;i++)
        {
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                // Check pair
                if( (stack.peek() == '(' && c == ')') || (stack.peek() == '{' && c == '}') || (stack.peek() == '[' && c == ']'))
                {
                    stack.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        if(stack.isEmpty())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "({[(]})";
        System.out.println(validPara(s));
    }
}
