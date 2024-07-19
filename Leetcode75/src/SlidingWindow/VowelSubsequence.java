package SlidingWindow;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelSubsequence {

    public static int maxVowels(String s, int k) {
    // Set of vowels for easy checking
    Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');

    int maxVowels = 0;
    int currentVowels = 0;

    // Count vowels in the first window of size k
        for (int i = 0; i < k; i++) {
        if (vowels.contains(s.charAt(i))) {
            currentVowels++;
        }
    }
    maxVowels = currentVowels;

    // Slide the window across the string
        for (int i = k; i < s.length(); i++) {
        if (vowels.contains(s.charAt(i - k))) {
            currentVowels--;
        }
        if (vowels.contains(s.charAt(i))) {
            currentVowels++;
        }
        maxVowels = Math.max(maxVowels, currentVowels);
    }

        return maxVowels;
}

    public static void main(String[] args) {
        VowelSubsequence solution = new VowelSubsequence();
        System.out.println(solution.maxVowels("abciiidef", 3)); // Output: 3
        System.out.println(solution.maxVowels("aeiou", 2));     // Output: 2
        System.out.println(solution.maxVowels("leetcode", 3));  // Output: 2
    }
}
