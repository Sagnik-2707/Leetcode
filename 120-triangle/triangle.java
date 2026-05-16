class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        for(int i=n-2;i>=0;i--)
        {
            for(int k=0;k<triangle.get(i).size();k++)
            {
                int left = triangle.get(i+1).get(k);
                int right = triangle.get(i+1).get(k+1);
                int updated = triangle.get(i).get(k) + Math.min(left,right);
                triangle.get(i).set(k,updated);
            }
        }
        return triangle.get(0).get(0);
    }
}