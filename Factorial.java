import java.util.Scanner;

public class Factorial {

    public static long factorial(int n){
        if(n <= 1) return 1;

        long result = 1;

        for(int i = 2; i <= n; i++){
            result *= i;
        }

        return result;
    }

    public static long fact(int n){
        if(n < 0) return -1;

        if(n ==0 || n ==1) return 1;

        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int n = sc.nextInt();

        System.out.println(factorial(n));

        System.out.println(fact(n));

    }
}
