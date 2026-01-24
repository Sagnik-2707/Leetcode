class Solution {
    private boolean isPossible(int bloomDay[], int day, int m, int k)
    {
        int n = bloomDay.length;
        int cnt = 0;
        int noOfB = 0;
        for(int i=0;i<n;i++)
        {
            if(bloomDay[i] <= day)
            {
                cnt++;
            }
            else
            {
                noOfB += (cnt/k);
                cnt = 0;
            }
        }
            noOfB += (cnt/k);
            return noOfB >= m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int n = bloomDay.length;
        long val = m * 1L * k * 1L;
        if(val > (int)n)
            return -1;
        for(int i=0;i<n;i++)
        {
            mini = Math.min(bloomDay[i], mini);
            maxi = Math.max(bloomDay[i], maxi);
        }
        int low = mini;
        int high = maxi;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(isPossible(bloomDay, mid, m ,k))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}