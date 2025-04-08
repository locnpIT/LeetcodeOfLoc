import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class _368_Largest_division_subset {
    /**
     * Finds the largest subset where every pair (a, b) satisfies a % b == 0 or b % a == 0.
     *
     * @param nums A list of distinct positive integers.
     * @return The largest divisible subset.
     */
    public List<Integer> largestDivisibleSubset(int[] nums) {
        // Handle edge case: empty or null input
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        // 1. Sort the array
        Arrays.sort(nums);
        int n = nums.length;

        // 2. Initialize dp and parent arrays
        // dp[i] stores the size of the largest divisible subset ending with nums[i]
        int[] dp = new int[n];
        Arrays.fill(dp, 1); // Each element itself is a subset of size 1

        // parent[i] stores the index of the previous element in the L.D.S. ending with nums[i]
        int[] parent = new int[n];
        Arrays.fill(parent, -1); // Initialize with -1 (no parent initially)

        // 3. Variables to track the max size and the index of the last element of the L.D.S.
        int maxSize = 1;
        int maxIndex = 0; // Index of the last element in the found L.D.S.

        // 4. Fill dp and parent arrays using dynamic programming
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                // If nums[i] is divisible by nums[j]...
                if (nums[i] % nums[j] == 0) {
                    // ...and extending the subset ending at nums[j] gives a larger subset for nums[i]
                    if (1 + dp[j] > dp[i]) {
                        dp[i] = 1 + dp[j]; // Update the size
                        parent[i] = j;     // Set nums[j] as the parent of nums[i]
                    }
                }
            }
            // Update the overall maximum size and index if the current subset is larger
            if (dp[i] > maxSize) {
                maxSize = dp[i];
                maxIndex = i;
            }
        }

        // 5. Reconstruct the largest divisible subset using the parent array
        List<Integer> result = new ArrayList<>();
        int currentIndex = maxIndex;
        while (currentIndex != -1) {
            result.add(nums[currentIndex]);
            currentIndex = parent[currentIndex]; // Move to the parent
        }

        // The result is constructed backwards, so reverse it (optional but typical)
        // Collections.reverse(result); // Uncomment if you need the subset sorted ascendingly

        return result; // The list is currently sorted descendingly
    }

    public static void main(String[] args) {
        _368_Largest_division_subset sol = new _368_Largest_division_subset();

        int[] nums1 = {1, 2, 3};
        System.out.println("Input: " + Arrays.toString(nums1));
        System.out.println("Output: " + sol.largestDivisibleSubset(nums1)); // Expected: [2, 1] or [3, 1] (before reverse)

        int[] nums2 = {1, 2, 4, 8};
        System.out.println("Input: " + Arrays.toString(nums2));
        System.out.println("Output: " + sol.largestDivisibleSubset(nums2)); // Expected: [8, 4, 2, 1] (before reverse)

        int[] nums3 = {3, 4, 16, 8};
        System.out.println("Input: " + Arrays.toString(nums3));
        // Sorted: [3, 4, 8, 16]
        System.out.println("Output: " + sol.largestDivisibleSubset(nums3)); // Expected: [16, 8, 4] (before reverse)

         int[] nums4 = {4, 8, 10, 240};
         System.out.println("Input: " + Arrays.toString(nums4));
         // Sorted: [4, 8, 10, 240]
         System.out.println("Output: " + sol.largestDivisibleSubset(nums4)); // Expected: [240, 8, 4] (before reverse)
    }
}

// upload to githubb