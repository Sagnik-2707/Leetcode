class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0, k=0;
        int n = nums.length;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        while(k<n)
        {
            sum += nums[k];
            while(sum>=target)
            {
                minLen = Math.min(minLen, k-i+1);
                sum = sum - nums[i];
                i++;
            }
            k++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}