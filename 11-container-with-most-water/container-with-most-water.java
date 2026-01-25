class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxWater = 0;
        int i=0, k=n-1;
        while(i<k)
        {
            int w = k-i;
            int h = Math.min(height[i], height[k]);
            int area = w*h;
            maxWater = Math.max(area, maxWater);
            if(height[i] > height[k])
                k--;
            else
                i++;
        }
        return maxWater;
    }
}