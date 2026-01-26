class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        for(int i=nums.length;i>1;i--)
        {
            for(int k=0;k<i-1;k++)
            {
                nums[k] = (nums[k] + nums[k+1])%10;
            }
        }
        return nums[0];
    }
}