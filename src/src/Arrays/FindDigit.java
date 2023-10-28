package Arrays;

public class FindDigit
{
    public static int findDigits(int n) {
        // Write your code here

        int num=n;
        int count =0;
        while(num != 0)
        {
            int d = num%10;
            if(d != 0 && n%d == 0)
            {
                count++;
            }
            num=num/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 124;
        System.out.println(findDigits(n));
    }

}
