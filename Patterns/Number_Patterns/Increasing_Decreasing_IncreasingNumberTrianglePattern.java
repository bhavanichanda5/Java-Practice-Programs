package Patterns.Number_Patterns;

public class Increasing_Decreasing_IncreasingNumberTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 5; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int k = 2; k <= n; k++){     //row
            for (int l = 1; l <= k; l++){       //column
                System.out.print(l+" ");
            }
            System.out.println();
        }
    }
}


/*
1  2  3  4  5
1  2  3  4
1  2  3
1  2
1
1  2
1  2  3
1  2  3  4
1  2  3  4  5

*/