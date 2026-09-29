import java.util.Scanner;

//A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself (e.g., 2, 3, 5, 7, 11).
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:- ");
        int num = sc.nextInt();

        if(isPrime(num)){
            System.out.println(num +" is a Prime Number.");
        }else{
            System.out.println(num+" is not a Prime Number.");
        }

    }

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        if(num == 2){
            return true;
        }

        if(num % 2 == 0){
            return false;
        }

        for(int i = 3; i * i <= num; i += 2){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
