class Solution {
    public int maxPower(String s) {
        int count = 1;
        int max = Integer.MIN_VALUE;
        s = s + " ";
        for(int i=0;i<s.length() - 1;i++)
        {
            if(s.charAt(i) == s.charAt(i+1))
            {
                count = count + 1;
            }
            else
            {
                max = Math.max(count,max);
                count = 1;
            }
        }
        return max;
    }
}