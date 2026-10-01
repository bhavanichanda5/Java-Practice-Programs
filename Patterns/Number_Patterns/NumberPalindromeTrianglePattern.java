package Patterns.Number_Patterns;

public class NumberPalindromeTrianglePattern {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for (int k = n-1; k >= 1; k--){   //row
            for (int l = 1; l <= k; l++){      //column
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}

/*
    Column Number
        1 2 3 4 5
1      1
2      1 2
3      1 2 3                    Row Number
4      1 2 3 4
5      1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
 */