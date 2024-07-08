package ArrayString;

public class StringCompress {

        public static int compress(char[] chars) {
            int n = chars.length;
            int write = 0; // Pointer to write the compressed characters

            for (int read = 0; read < n; ) {
                char currentChar = chars[read];
                int count = 0;

                // Count the number of consecutive repeating characters
                while (read < n && chars[read] == currentChar) {
                    read++;
                    count++;
                }

                // Write the character
                chars[write++] = currentChar;

                // Write the count if greater than 1
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[write++] = c;
                    }
                }
            }

            return write;
        }

    }
