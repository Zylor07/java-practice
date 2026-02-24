
public class PrintNnums {
    public static void main(String[] args) {
        nNums(5, 0); // Calling the method to print 0 through 4
    }

    public static void nNums(int n, int count) {
        // Base Case: Stop when count reaches n
        if (count == n) {
            return;
        }

        System.out.println(count);
        
        // Recursive Call: Pass the incremented count to the next level
        nNums(n, count + 1);
    }
}