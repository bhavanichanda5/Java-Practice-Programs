package Patterns.Number_Patterns;

//called a Decreasing Number Square Pattern or Concentric Number Square Pattern.
public class DecreasingSquaresPattern
{
    public static void main(String[] args)
    {
        int n = 9;
        int max = 5;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                int min = Math.min(
                        Math.min(i, j),
                        Math.min(n - 1 - i, n - 1 - j)
                );
                System.out.print((max - min) + " ");
            }
            System.out.println();
        }
    }
}


/*
5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5

 */