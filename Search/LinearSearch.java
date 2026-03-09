public class LinearSearch {
    // Made static for easy access in main
    public static int search(int[] n, int target) {
        for (int i = 0; i < n.length; i++) {
            if (n[i] == target) {
                return i; // Return the index of the element
            }
        }
        return -1; // Standard "not found" indicator
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 7, 1, 9, 20};
        int target = 7;
        
        int result = search(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}