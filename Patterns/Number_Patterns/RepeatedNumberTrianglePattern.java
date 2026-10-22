package Patterns.Number_Patterns;

public class RepeatedNumberTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++){

           /* //space
            for (int s = 0; s < n - i; s++)
            {
                System.out.print(" ");
            }*/

            for (int j = 0; j <= i; j++){
                System.out.print(i+1 +" ");
            }
            System.out.println();
        }
    }
}

/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */
