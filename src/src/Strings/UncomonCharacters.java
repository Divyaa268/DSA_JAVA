package Strings;

import java.util.HashMap;

public class UncomonCharacters {

        public static String findUncommonCharacters(String str1, String str2) {
            // Use HashMap to store character counts from both strings
            HashMap<Character, Integer> charCount = new HashMap<>();

            // Traverse first string and add characters to the map
            for (char c : str1.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            // Traverse second string and add characters to the map
            for (char c : str2.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) - 1);
            }

            // StringBuilder to store the result
            StringBuilder result = new StringBuilder();

            // Traverse the map and collect characters with count +/- 1
            for (char c : charCount.keySet()) {
                if (Math.abs(charCount.get(c)) == 1) {
                    result.append(c);
                }
            }

            // Convert StringBuilder to String and return
            return result.toString();
        }

        public static void main(String[] args) {
            // Example usage
            String str1 = "characters";
            String str2 = "alphabets";

            String uncommon = findUncommonCharacters(str1, str2);
            System.out.println("Uncommon characters: " + uncommon);
        }
    }
