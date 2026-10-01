package Patterns.Number_Patterns;

//This is called a Hollow/Shifted Number Diamond Pattern or Increasing-Decreasing Number Diamond.
public class HollowNumberDiamondPattern {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++)
        {
            //space
            for (int s = 1; s < i; s++){
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++){
                System.out.print(j+" ");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--)
        {
            //space
            for (int s = 1; s < i; s++) {
                System.out.print(" ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }

    }
}

/*

1 2 3 4 5
 2 3 4 5
  3 4 5
   4 5
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

 */