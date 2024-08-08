class Solution {
    public int countSubstrings(String s, String t) {
        int totalCount = 0;

        // Iterate over each starting position in string s
        for (int i = 0; i < s.length(); ++i) {
            // Iterate over each starting position in string t
            for (int j = 0; j < t.length(); ++j) {
                int mismatchCount = 0;

                // Check substrings starting at positions i in s and j in t
                for (int k = 0; i + k < s.length() && j + k < t.length(); ++k) {
                    // Compare characters from both strings
                    if (s.charAt(i + k) != t.charAt(j + k)) {
                        mismatchCount++;
                    }

                    // If there's more than one mismatch, stop checking further
                    if (mismatchCount > 1) {
                        break;
                    }

                    // If there's exactly one mismatch, it's a valid substring pair
                    if (mismatchCount == 1) {
                        totalCount++;
                    }
                }
            }
        }

        return totalCount;
    }
}