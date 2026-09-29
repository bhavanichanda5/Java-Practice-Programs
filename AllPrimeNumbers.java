import java.util.Arrays;
import java.util.Scanner;

public class AllPrimeNumbers {
    public static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            if (isPrime[p]) {
                // Mark multiples of p starting from p*p as non-prime
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        return isPrime; // isPrime[x] will be true if x is prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:- ");
        int num = sc.nextInt();

        boolean[] primes = sieveOfEratosthenes(num);

        System.out.println("Prime numbers up to " + num + ":");
        for (int i = 2; i <= num; i++) {
            if (primes[i]) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}