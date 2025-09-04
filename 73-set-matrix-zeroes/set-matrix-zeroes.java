class Solution {
    public void setZeroes(int[][] matrix) {
        int col0=1;
        for(int i=0;i<matrix.length;i++)
        {
            for(int k=0;k<matrix[0].length;k++)
            {
                if(matrix[i][k] == 0)
                {
                    matrix[i][0] = 0;
                    if(k!=0)
                    {
                        matrix[0][k] = 0;
                    }
                    else
                    {
                        col0=0;
                    }
                }
            }
        }
        for(int i=1;i<matrix.length;i++)
        {
            for(int k=1;k<matrix[0].length;k++)
            {
                if(matrix[i][k] != 0)
                {
                    if(matrix[i][0] == 0 || matrix[0][k] == 0)
                    {
                        matrix[i][k] = 0;
                    }
                }
            }
        }
        if(matrix[0][0] == 0)
        {
            for(int k=0;k<matrix[0].length;k++)
            {
                matrix[0][k] = 0;
            }
        }
        if(col0 == 0)
        {
            for(int i=0;i<matrix.length;i++)
            {
                matrix[i][0] = 0;
            }
        }
    }
}