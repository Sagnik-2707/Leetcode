class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        for(int i=0;i<=n-3;i++)
        {
            int left = i+1;
            int right = n-1;
            while(left<right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target-sum) < Math.abs(target-closest))
                    closest = sum;
                if(sum<target)
                    left++;
                else
                    right--;
            }
        }
        return closest;
    }
}