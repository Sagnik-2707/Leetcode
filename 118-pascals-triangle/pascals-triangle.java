class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            if(i>0)
            {
                for(int k=1;k<i;k++)
                {
                    row.add(result.get(i-1).get(k-1) + result.get(i-1).get(k));
                }
                row.add(1);
            }
            result.add(row);
        }
        return result;
    }
}