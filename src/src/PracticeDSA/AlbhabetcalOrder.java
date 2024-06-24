package PracticeDSA;


import java.util.ArrayList;
import java.util.List;

public class AlbhabetcalOrder {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Cherry");
        list.add("Mango");
        list.add("Strawberry");

        // Print the list before sorting
        System.out.println("Before sorting:");
        for (String s : list) {
            System.out.println(s);
        }

        // Or simply do Collections.sort(list);

        // Sort the list in alphabetical order using bubble sort
        bubbleSort(list);

        // Print the list after sorting
        System.out.println("\nAfter sorting:");
        for (String s : list) {
            System.out.println(s);
        }
    }

    // Bubble sort algorithm to sort a list of strings in alphabetical order
    public static void bubbleSort(List<String> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                    // Swap list[j] and list[j + 1]
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
}

