package Patterns.Number_Patterns;

//Continuous Number Triangle Pattern (or Floyd's Triangle).
public class FloydTriangle {
    public static void main(String[] args) {
        int n = 5;

        int k = 1;

        for(int i = 1; i <= n; i++){      //row
            for (int j = 1; j <= i; j++){   //column
                System.out.print(k+"  ");
                k++;
            }
            System.out.println();
        }
    }
}


/*

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */