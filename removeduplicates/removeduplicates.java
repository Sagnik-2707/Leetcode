class Solution {
    public int removeDuplicates(int[] nums) 
    {
        if(nums.length == 0)
                return 0;
        int i = 1;
        for(int k=1;k<nums.length;k++)
        {
            if(nums[i-1] != nums[k])
            {
                nums[i] = nums[k];
                i=i+1;
            }
        }
        return i;
    }
}