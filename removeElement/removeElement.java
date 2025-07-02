class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0; // Slow-runner pointer

        for (int k = 0; k < nums.length; k++) { // Fast-runner pointer
            if (nums[k] != val) {
                nums[i] = nums[k];
                i++;
            }
        }

        return i; // New length (number of elements != val)
    }
}
