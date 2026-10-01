package Patterns.Number_Patterns;

public class DecreasingReverseNumberTrianglePattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--){ //row
            for (int j = i; j >= 1; j--){     //column
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

/*

5  4  3  2  1
4  3  2  1
3  2  1
2  1
1

 */