class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int k=0;k<grid[0].length;k++)
            {
                if(grid[i][k] < 0)
                {
                    count = count + 1;
                }
            }
        }
        return count;
    }
}