public class IsSubsequence {
//     public boolean isSubsequence(String s, String t) {
//         int l = t.length();
//         int c = 0;
//         String ss = "";

//         int lastMatchedPos = -1;

//         for (int i = 0; i < s.length(); i++) {
//             boolean found = false;
//             for (int j = lastMatchedPos + 1; j < l; j++) {
//                 if (s.charAt(i) == t.charAt(j)) {
//                     ss = ss + s.charAt(i);
//                     lastMatchedPos = j;
//                     found = true;
//                     break; // Move to the next character in s
//                 }
//             }
//             if (!found) {
//                 return false; // If we didn't find the current character in s, return false
//             }
//         }

//         return ss.equals(s);
//     }
// }

    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }

        return sIndex == s.length();
    }

    public static void main(String args[])
    {
        String s = "abc";
        String t = "axbecd";

        System.out.println(isSubsequence(s,t));


    }
}
