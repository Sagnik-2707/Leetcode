class Solution {
    private int sumByDivisor(int nums[], int d)
    {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++)
        {
            sum += (int) Math.ceil(((double) (nums[i])) / ((double) d));
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i< nums.length;i++)
        {
            maxi = Math.max(maxi, nums[i]);        
        }
        int high = maxi;
        int n = nums.length;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(sumByDivisor(nums, mid) <= threshold)
                high  = mid - 1;
            else
                low = mid + 1;
        }
        return low;

    }
}