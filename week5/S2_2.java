class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int maxSum = nums[0], curMax = 0;
        int minSum = nums[0], curMin = 0;
        
        for (int num : nums) {
            // Standard Kadane's for max subarray
            curMax = Math.max(curMax + num, num);
            maxSum = Math.max(maxSum, curMax);
            
            // Kadane's variant for min subarray
            curMin = Math.min(curMin + num, num);
            minSum = Math.min(minSum, curMin);
            
            total += num;
        }
        
        // If all numbers are negative, maxSum holds the best (least negative) answer,
        // and total - minSum would wrongly equal 0 (empty subarray), so skip that case.
        if (maxSum < 0) {
            return maxSum;
        }
        
        return Math.max(maxSum, total - minSum);
    }
}

Input:
nums =
[1,-2,3,-2]
Output:
3