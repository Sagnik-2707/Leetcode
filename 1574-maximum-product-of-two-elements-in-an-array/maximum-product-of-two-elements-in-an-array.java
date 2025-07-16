class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            for(int k=i+1;k<nums.length;k++)
            {
                max = Math.max(max, (nums[i] - 1)* (nums[k] - 1));
            }
        }
        return max;
    }
}