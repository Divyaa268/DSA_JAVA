package Strings;

public class FirstLetterToUpper {

    public static String firstUpper(String s) {
//        s = " " + s;
//        String str = "";
//        int l = s.length();
//        for(int i=0;i<l-1;i++)
//        {
//            if(s.charAt(i) != ' ')
//            {
//                str = str + s;
//            }
//            else
//            {
//                str = str + (char)(s.charAt(i+1) - 32);
//            }
//        }
//        return str;
//    }

        StringBuilder sb = new StringBuilder("");

        char c = Character.toUpperCase(s.charAt(0));
        sb.append(c);

        for (int i = 1; i < s.length(); i++)
        {
            if (s.charAt(i) == ' ' && i < s.length() - 1)
            {
                sb.append(s.charAt(i));
                i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
        public static void main(String args[])
        {
            String s = "hello, my name is Lewis";
            String str = firstUpper(s);
            System.out.println(str);
        }
    }

