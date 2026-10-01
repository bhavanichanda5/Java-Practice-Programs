import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static int[] sortArr(int[] arr){
        Arrays.sort(arr);

        return arr;
    }

    public static int[] bubbleSort(int[] arr){
        int n = arr.length-1;

        for(int i = 0; i < n ; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    //Swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static void mergeSort(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter Elements in the Array : -");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Sorted Array : ");
        for (int a : sortArr(arr)){
            System.out.print(a +" ");
        }

        System.out.println();

        System.out.print("Bubble Sort Array : ");
        for (int a : bubbleSort(arr)){
            System.out.print(a +" ");
        }
    }

}
