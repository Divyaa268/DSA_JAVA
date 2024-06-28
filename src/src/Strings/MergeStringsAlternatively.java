package Strings;
import java.util.Arrays;

public class MergeStringsAlternatively {

    public String mergeAlternately(String word1, String word2) {

        int l1 = word1.length();
        int l2 = word2.length();

        // Convert strings to character arrays
        char s1[] = word1.toCharArray();
        char s2[] = word2.toCharArray();

        // Create a new character array to hold the merged result
        char s3[] = new char[l1 + l2];

        int i = 0, j = 0, k = 0;

        // Merge characters from both arrays alternately
        while (i < l1 && j < l2) {
            s3[k++] = s1[i++];
            s3[k++] = s2[j++];
        }

        // Append remaining characters from word1, if any
        while (i < l1) {
            s3[k++] = s1[i++];
        }

        // Append remaining characters from word2, if any
        while (j < l2) {
            s3[k++] = s2[j++];
        }

        // Convert the character array back to a string
        return new String(s3);
    }

    public static void main(String[] args) {
        MergeStringsAlternatively solution = new MergeStringsAlternatively();
        System.out.println(solution.mergeAlternately("abc", "pqr")); // Output: "apbqcr"
        System.out.println(solution.mergeAlternately("ab", "pqrs")); // Output: "apbqrs"
        System.out.println(solution.mergeAlternately("abcd", "pq")); // Output: "apbqcd"
    }
}
