package Patterns.Number_Patterns;

public class BinaryNumberTrianglePattern
{
    public static void main(String[] args)
    {
        int n = 5;

        //The numbers alternate between 1 and 0.
        //- Odd position → 1
        //- Even position → 0

        //Way - 1

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print((j % 2 == 1 ? 1 : 0)+" ");
            }
            System.out.println();
        }


        System.out.println("\n************************************\n");

        //Way - 2

        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if(j % 2 == 0)
                {
                    System.out.print("0 ");
                }else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }

    }
}

/*
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
 */