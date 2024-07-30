public class Solution {
	public static long reverseBits(long n) {
		// Write your code here
		long result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;             // Shift result to the left
            result |= (n & 1);        // Add the least significant bit of n to result
            n >>= 1;                  // Shift n to the right
        }
        return result;
	}
}