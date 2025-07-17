import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Sort the array first
        Arrays.sort(nums);
        
        // Check for adjacent duplicates
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true; // Duplicate found
            }
        }
        
        return false; // No duplicates
    }
}
