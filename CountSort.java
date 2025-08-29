import java.util.Arrays;

public class CountSort {
    static int[] c_sort(int arr[]) {
        int k = arr[0];

        // Find the maximum value in the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > k) {
                k = arr[i];
            }
        }

        // Count array
        int count[] = new int[k + 1];

        // Count frequency of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Prefix sum (cumulative frequency)
        for (int i = 1; i <= k; i++) {
            count[i] += count[i - 1];
        }

        // Output array (stable sort)
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // Copy sorted output back to original array
        System.arraycopy(output, 0, arr, 0, arr.length);

        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 5, 2, 0, 6, 9};
        System.out.println(Arrays.toString(c_sort(arr)));
    }
}
