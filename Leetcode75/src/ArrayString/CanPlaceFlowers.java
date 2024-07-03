package ArrayString;

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
//
//        int l = flowerbed.length;
//        int count = 0;
//
//        for (int i = 0; i < l - 2; i++) {
//            if (flowerbed[i] == 1 && flowerbed[i + 1] == 0 && flowerbed[i + 2] == 0) {
//                flowerbed[i + 2] = 0;
//                count++;
//            }
//        }
//        if (n == count) {
//            return true;
//        } else
//        {
//            return false;
//        }
//
//    }
        int count = 0;
        int i = 0;
        int l = flowerbed.length;

        while (i < l) {
            // Check if the current position and its adjacent positions are suitable for planting
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == l - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; // Plant a flower
                count++;
            }
            i++;
        }

        return count >= n;
    }
    public static void main(String args[])
    {
        int candies[] = {1,0,0,0,1};
        int n = 2;

        System.out.println(canPlaceFlowers(candies, n));
    }
}
