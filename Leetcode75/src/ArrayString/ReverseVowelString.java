package ArrayString;

public class ReverseVowelString {
        public static String reverseVowels(String s) {

//         s = s.toLowerCase();
//         int l = s.length();

//         int st = 0;
//         int lt = l-1;

//         while(st < lt)
//         {
//             if( (s.charAt(st) == 'a' || s.charAt(st) == 'e' || s.charAt(st) == 'i' || s.charAt(st) == 'o' || s.charAt(st) == 'u') && (s.charAt(lt) == 'a' || s.charAt(lt) == 'e' || s.charAt(lt) == 'i' || s.charAt(lt) == 'o' || s.charAt(lt) == 'u') )
//             {
//                 char t = s.charAt(st);
//                 s.charAt(st) = s.charAt(lt);
//                 s.charAt(lt) = t;
//             }
//             st++;
//             lt--;
//         }
//         return s;
//     }
// }

            // Convert the string to a character array
            char[] chars = s.toCharArray();
            int l = chars.length;

            int st = 0;
            int lt = l - 1;

            while (st < lt) {
                // Move the st pointer until a vowel is found
                while (st < lt && !isVowel(chars[st])) {
                    st++;
                }
                // Move the lt pointer until a vowel is found
                while (st < lt && !isVowel(chars[lt])) {
                    lt--;
                }

                // Swap the vowels
                if (st < lt) {
                    char t = chars[st];
                    chars[st] = chars[lt];
                    chars[lt] = t;

                    // Move the pointers
                    st++;
                    lt--;
                }
            }

            return new String(chars);
        }

        // Helper method to check if a character is a vowel
        private static boolean isVowel(char c) {
            return "aeiouAEIOU".indexOf(c) != -1;
        }

        public static void main(String args[])
        {
            String s = "hello";
            System.out.println(reverseVowels(s));


    }

//
//class Solution {
//    public String reverseVowels(String s) {
//
//        char[] chars = s.toCharArray();
//
//        int start = 0 ;
//
//        int end = s.length()-1;
//
//        while (start<end){
//            while (start < end && !isVowel(chars[start])) {
//                start++;
//            }
//
//            while (start < end && !isVowel(chars[end])) {
//                end--;
//            }
//
//            if (start < end) {
//                swap(chars, start, end);
//                start++;
//                end--;
//            }
//
//        }
//
//        return new String(chars);
//    }
//
//    private void swap(char[] word, int start, int end){
//        char temp = word[start];
//        word[start] = word[end];
//        word[end] = temp;
//    }
//
//    private boolean isVowel(char c) {
//        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
//                || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
//    }
}