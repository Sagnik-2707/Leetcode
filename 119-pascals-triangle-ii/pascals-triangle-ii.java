class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            row.add(1);
            for(int k=i-1;k>0;k--)
            {
                row.set(k,row.get(k) + row.get(k-1));
            }
        }
        return row;
    }
}