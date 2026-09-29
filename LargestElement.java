import java.util.Scanner;

public class LargestElement {

    public static int getLargest(int[] arr){
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be Empty.");
        }

        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter Elements in the Array : -");
        for(int i = 1; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(getLargest(arr));

    }
}
