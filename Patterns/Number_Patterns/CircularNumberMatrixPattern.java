package Patterns.Number_Patterns;

public class CircularNumberMatrixPattern
{
    public static void main(String[] args)
    {
        int n = 5;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print((i + j - 1)  %  n + 1+" ");
            }
            System.out.println();
        }
    }
}

/*
1 2 3 4 5
2 3 4 5 1
3 4 5 1 2
4 5 1 2 3
5 1 2 3 4

Sub-Pattern 1

1 2 3 4 5
2 3 4 5
3 4 5
4 5
5


Sub-Pattern 2

1
1 2
1 2 3
1 2 3 4
 */