package Strings;

public class Solution {
        public String solution(String S)
        {
            char[] d = S.toCharArray();

            int[] count = new int[10];
            for (char c : d)
            {
                count[c - '0']++;
            }

            StringBuilder palin = new StringBuilder();

            for (int i = 9; i >= 0; i--)
            {
                while (count[i] > 1)
                {
                    palin.insert(0, (char) (i + '0'));
                    palin.append((char) (i + '0'));
                    count[i] -= 2;
                }
            }

            for (int i = 9; i >= 0; i--)
            {
                if (count[i] > 0)
                {
                    palin.insert(palin.length() / 2, (char) (i + '0'));
                    break;
                }
            }

            while (palin.length() > 1 && palin.charAt(0) == '0')
            {
                palin.deleteCharAt(0);
            }

            while (palin.length() > 1 && palin.charAt(palin.length() - 1) == '0')
            {
                palin.deleteCharAt(palin.length() - 1);
            }

            return palin.toString();
        }


    public static void main(String[] args) {
            Solution solution = new Solution();
            System.out.println(solution.solution("39878")); // Output: "898"
            System.out.println(solution.solution("00900")); // Output: "9"
            System.out.println(solution.solution("00000")); // Output: "0"
            System.out.println(solution.solution("54321")); // Output: "5"
        }
    }


//    ----------------------------------------------------------------------------------------



