package Patterns;

//1
//23
//456
//78910
//1112131415

public class FloydsTriangle {

    public static void main(String[] args) {

        int k=1;

        for(int r=1;r<=5;r++)
        {
            for (int c=1;c<=r;c++)
            {
                System.out.print(k++);
            }
            System.out.println();
        }
    }
}
