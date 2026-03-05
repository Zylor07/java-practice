public class SelectionsortMax {
    public static void sorting(int[] arr) {
        // Outer loop moves the boundary of the unsorted subarray
        for (int i = 0; i < arr.length - 1; i++) {
            int maxIdx = i; // Assume the first element is the largest

            // Inner loop finds the actual maximum in the remaining array
            for (int j = i + 1; j < arr.length; j++) {
                // Change < to > to find the Maximum instead of Minimum
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }

            // Swap the found maximum element with the first element
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }

        // Now printing in standard order (0 to length) shows Descending
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {87, 67, 45, 90, 100};
        sorting(arr);
    }
}