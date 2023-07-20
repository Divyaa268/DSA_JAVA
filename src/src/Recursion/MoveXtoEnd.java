package Recursion;

public class MoveXtoEnd {

    public static String moveX(String s)
    {
        if(s == null)
        {
            return null;
        }
        if(s.length() == 0)
        {
            return "" ;
        }

        if(s.charAt(0) != 'x')
        {
            return s.charAt(0) + moveX(s.substring(1));
        }
        return moveX(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {

        String s = "axbcxxd";
       String st = moveX(s);
        System.out.println(st);
    }
}
