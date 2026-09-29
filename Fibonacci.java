import java.util.Scanner;

public class Fibonacci {

    public static void printFibonacci(int n){
        if(n <= 0) return;

        int a = 0; int b = 1;
        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for(int i = 2; i <= n; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        printFibonacci(n);
        fibonacci(n);
        sc.close();
    }
}
