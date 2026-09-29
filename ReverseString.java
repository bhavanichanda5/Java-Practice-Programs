import java.util.Scanner;

public class ReverseString {

    public static String revStrBuilder(String s){

        //return new StringBuilder(s).reverse().toString();

        StringBuilder reverse = new StringBuilder(s).reverse();

        return reverse.toString();
    }

    public static String revStr(String s){
        String reverse = "";
        for (int i = s.length()-1; i  >= 0; i--){
            reverse += s.charAt(i);
        }
        return reverse;
    }

    public static String revStr1(String s){
        char[] strArr = s.toCharArray();

        int left = 0;
        int right = strArr.length-1;

        while(left < right){
            char temp = strArr[left];
            strArr[left] = strArr[right];
            strArr[right] = temp;

            left ++;
            right--;
        }

        //String str = new String(strArr);

        return new String(strArr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();

        System.out.println("Reverse String :- "+revStr(str));
        System.out.println("Reverse String :- "+revStr1(str));
        System.out.println("Reverse String :- "+revStrBuilder(str));
    }
}
