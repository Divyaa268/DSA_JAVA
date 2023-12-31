package Strings;

public class IsomorphicStrings {

    public  static boolean isomorphic(String s, String t)
    {

        if(s.length() != t.length())
            return false;

        int [] a1 = new int[256];
        int [] a2 = new int[256];


        for(int i=0;i<s.length();i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);

//            System.out.println("f" + a1[a]);
//            System.out.println("f" + a2[b]);

            if(a1[a] != a2[b])
            {
                return false;
            }

            a1[a] = i+1;
            a2[b] = i+1;

//            System.out.println("s" + a1[a]);
//            System.out.println("s" + a2[b]);

        }
        return true;
    }

    public static void main(String[] args) {

        String s = "egg";
        String t = "abd";

        boolean b = isomorphic(s,t);
        System.out.println(b);
    }
}
