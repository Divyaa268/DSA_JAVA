package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class FindUnique {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n=s.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=s.nextInt();
            }

            int b= findUnique(a);
            System.out.println(b);
        }

        public static int findUnique(int[] arr){

            int l=arr.length;
            int ele=0;
            for(int i=0;i<l;i++)
            {
                // if we do XOR of same elements we get 0 i.e 5^5 => 101 ^ 101 = 000
                ele^=arr[i];
            }

            return ele;
        }

    }
