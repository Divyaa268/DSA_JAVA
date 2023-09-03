package HashMap;

import java.util.HashSet;

public class FindUnionAndIntersection {

    public static void main(String[] args) {

        int arr1[] = {7,3,9};
        int arr2[] = {3,2,1,9,4,6};

        HashSet<Integer> set = new HashSet<>();

        // Union
        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }

        for (int j=0;j<arr2.length;j++)
        {
            set.add(arr2[j]);
        }

        System.out.println("Union size is : " + set.size());


        // Intersection
        set.clear();

        int count = 0;

        for (int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }
        for (int j=0;j<arr2.length;j++)
        {
            if(set.contains(arr2[j]))
            {
                count++;
            }
        }

        System.out.println("Intersection size is : " + count);
    }
}
