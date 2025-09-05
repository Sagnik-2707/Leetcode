class Solution {
    public int[][] generateMatrix(int n) {
        int b,i,r=0,c=-1,p=0;
        b=n;
        int a[][] = new int[n][n];
        while(b>0)
        {
            for(i=0;i<b;i++)
            {
                a[r][++c] = ++p;
            }
            for(i=0;i<b-1;i++)
            {
                a[++r][c] = ++p;
            }
            for(i=0;i<b-1;i++)
            {
                a[r][--c] = ++p;
            }
            for(i=0;i<b-2;i++)
            {
                a[--r][c] = ++p;
            }
            b=b-2;
        }
        return a;
    }
}