class Solution {
    public int pivotIndex(int[] nums) {
        // Store the total sum of the array
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        // Stores the sum of elements
        // present on the left side
        int leftSum = 0;
        // Traverse every index
        for (int i = 0; i < nums.length; i++) {
            // Right sum =
            // Total Sum
            // - Left Sum
            // - Current Element
            int rightSum = totalSum - leftSum - nums[i];
            // Check if current index is pivot
            if (leftSum == rightSum) {
                return i;
            }
            // Add current element to left sum
            // before moving to next index
            leftSum += nums[i];
        }
        // No pivot index found
        return -1;
    }
} 