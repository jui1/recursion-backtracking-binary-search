package recursion;


public class reverse {
    public static void main(String[] args) {
        System.out.println(ans(12345678));  // Should print 87654321
    }

    private static int ans(int n) {
        return reverseHelper(n, 0);
    }

    // Helper function to accumulate the reversed number
    private static int reverseHelper(int n, int reversed) {
        // Base case: when n becomes 0, return the reversed number
        if (n == 0) {
            return reversed;
        }

        // Take the last digit and add it to the reversed number
        int rem = n % 10;

        // Recursive call with the new number and updated reversed number
        return reverseHelper(n / 10, reversed * 10 + rem);
    }
}
