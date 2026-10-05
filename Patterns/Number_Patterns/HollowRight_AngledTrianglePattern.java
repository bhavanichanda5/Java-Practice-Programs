package Patterns.Number_Patterns;

public class HollowRight_AngledTrianglePattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (j == 1 || j == i || i == 5)
                {
                    System.out.print(i+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


/*
1
2 2
3   3
4     4
5 5 5 5 5
 */