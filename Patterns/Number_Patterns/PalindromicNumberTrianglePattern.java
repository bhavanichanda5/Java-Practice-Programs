package Patterns.Number_Patterns;

public class PalindromicNumberTrianglePattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {

            // Increasing
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Decreasing
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
