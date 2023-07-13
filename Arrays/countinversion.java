// understand merge sort in clear manner to solve this question
class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], long N) {
        if (N <= 1) {
            return 0; // Base case: array is already sorted or empty
        }

        long mid = N / 2;
        int midInt = (int) mid; // Cast 'mid' to int
        long[] left = new long[midInt];
        long[] right = new long[(int) (N - mid)]; // Cast 'N-mid' to int

        for (int i = 0; i < midInt; i++) {
            left[i] = arr[i];
        }
        for (int i = 0; i < N - mid; i++) {
            right[i] = arr[midInt + i];
        }
        long leftCount = inversionCount(left, mid);
        long rightCount = inversionCount(right, N - mid);
        return sort(arr, left, right) + leftCount + rightCount;
    }

    public static long sort(long[] arr, long[] left, long[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        long count = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
                count += left.length - i; // Update count for inversions
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
        return count;
    }
 }
