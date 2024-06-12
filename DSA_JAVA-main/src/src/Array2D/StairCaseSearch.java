package Array2D;

public class StairCaseSearch {

    public static boolean staircaseSearch(int a[][], int key)
    {
        int row = 0;
        int col = a[0].length-1;

        while( row < a.length && col >= 0)
        {
            if(a[row][col] == key)
            {
                System.out.println("Key found at cell " + "(" + row + "," + col + ")");
                return true;
            }
            else if(key < a[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        System.out.println("Key doesn't exist!");
        return false;

    }

    public static void main(String[] args) {

        int a[][] = {{10,20,30,40}, {15,25,35,45}, {27,29,37,48}, {32,33,39,50}};
        int key = 33;

        boolean res = staircaseSearch(a,key);
        System.out.println(res);
    }


}
