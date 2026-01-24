class Solution {
    private int getDays(int weights[], int capacity)
    {
        int days = 1, load = 0;
        int n = weights.length;
        for(int i=0;i<n;i++)
        {
            if(weights[i] + load > capacity)
            {
                days = days + 1;
                load = weights[i];
            }
            else
            {
                load += weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        int n = weights.length;
        for(int i=0;i<n;i++)
        {
            maxi = Math.max(maxi, weights[i]);
            sum = sum + weights[i];
        }
        int low = maxi;
        int high = sum;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(getDays(weights, mid) <= days)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}