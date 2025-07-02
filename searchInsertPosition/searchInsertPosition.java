class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        if(nums.length == 0)
        {
            return 0;
        }
        if(nums.length == 1 && nums[nums.length - 1] > target)
        {
            return 0;
        }
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i] != target)
            {
                if(nums[i]<target && nums[i+1]>target)
                {
                    return i+1;
                }
                else if(i==0 && nums[i] > target)
                {
                    return 0;
                }
            }
            else
            {
                return i;
            }
        }
        if(nums[nums.length-1] == target)
        {
            return (nums.length - 1);
        }
        return nums.length;
        
           
    }
}