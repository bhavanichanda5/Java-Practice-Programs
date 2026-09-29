import java.util.Scanner;

public class Palindrome {

    public static boolean isPalindrome(String str){
        String rev = "";

        for (int i = str.length()-1; i >= 0; i--){
            rev += str.charAt(i);
        }

        return rev.equals(str);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String :- ");
        String str = sc.nextLine();

        if(isPalindrome(str)){
            System.out.println(str+" String is a Palindrome.");
        }else{
            System.out.println(str+" String is not a Palindrome.");
        }

    }
}
