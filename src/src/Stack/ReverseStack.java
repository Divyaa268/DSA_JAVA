package Stack;

import java.util.Stack;

public class ReverseStack {

    public static void pushBottom(Stack<Integer> s, int element)
    {
        if(s.isEmpty())
        {
            s.push(element);
            return;
        }
        int top = s.pop();
        pushBottom(s, element);
        s.push(top);
    }

    public static void reverseStack(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

//        while (!s.isEmpty()) {
//            System.out.println(s.peek());
//            s.pop();
//        }

        reverseStack(s);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
