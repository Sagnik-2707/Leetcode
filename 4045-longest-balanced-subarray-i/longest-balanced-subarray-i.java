class Solution {
    public int longestBalanced(int[] nums) {
        int maxLen = 0;
        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> even = new HashSet<>();
            HashSet<Integer> odd = new HashSet<>();
            for(int k=i;k<n;k++)
            {
                if(nums[k]%2 == 0)
                    even.add(nums[k]);
                else
                    odd.add(nums[k]);
                if(even.size() == odd.size())
                    maxLen = Math.max(maxLen, k-i+1);
            }
        }
        return maxLen;
    }
}