package Patterns.Number_Patterns;

public class PalindromicNumberTrianglePattern {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++)
        {

            //Increasing
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            /*
                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5
            */

            //Decreasing
            for (int j = i - 1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
            /*
                    1
                    2 1
                    3 2 1
                    4 3 2 1
             */

            System.out.println();
        }
    }
}

/*
1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
 */