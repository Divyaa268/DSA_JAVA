package HashMap;

import java.util.HashMap;
import java.util.Set;

public class MajorityElement {

    public static void main(String[] args) {

        int a[] = {1,2,3,1,1,3,2,1,1};
        int l = a.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<l;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i], map.get(a[i]) + 1);
            }
            else
            {
                map.put(a[i], 1);
            }
        }

//        map.put(a[i], map.getOrDefault(a[i], defaultValue: 0 + 1));

        Set<Integer> keySet = map.keySet(); // stores and returns key

        for (Integer key : keySet)
        {
            if(map.get(key) > l/3)
            {
                System.out.println("Majority element is : " + key);

            }
        }
    }
}
