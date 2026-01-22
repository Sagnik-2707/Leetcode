class Solution {
    private int findMax(int piles[])
    {
        int max = piles[0];
        for(int i=1;i<piles.length;i++)
        {
            max = Math.max(max, piles[i]);
        }
        return max;
    }
    private long calculateTotalHours(int piles[], int speed)
    {
        long totalH= 0;
        for(int i=0;i<piles.length;i++)
        {
            totalH += (int)Math.ceil((double)piles[i]/speed);
        }
        return totalH;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = findMax(piles);
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            long totalH = calculateTotalHours(piles, mid);
            if(totalH <= (long)h)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}