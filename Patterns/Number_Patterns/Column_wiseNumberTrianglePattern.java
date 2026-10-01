package Patterns.Number_Patterns;

public class Column_wiseNumberTrianglePattern {
    public static void main(String[] args) {

        int[][] a = new int[5][5];  //Outer Array & Inner Array                 //[rows][columns]

        int k = 1;

        for(int col = 0; col < 5; col++){
            for (int row = col; row < 5; row++){
               a[row][col] = k++;
            }
        }

        for (int i = 0; i <5; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}


/*

1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

 */