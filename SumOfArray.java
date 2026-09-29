public class SumOfArray {

    public static int sumOfArray1(int[] arr){
        int sum = 0;

        for(int n : arr){
            sum += n;
        }
        return sum;
    }

    public static int sumOfArray2(int[] arr){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
           sum+= arr[i];
        }
        return sum;
    }

    public static int calculateSumRecursive(int[] arr, int n) {
        // Base case: if no elements left
        if (n <= 0) {
            return 0;
        }

        // Add current element to sum of remaining elements
        return arr[n - 1] + calculateSumRecursive(arr, n - 1);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Sum Of Array  "+sumOfArray1(arr));
        System.out.println("Sum Of Array  "+sumOfArray2(arr));
        System.out.println("Sum: " + calculateSumRecursive(arr, arr.length));
    }
}
