class Solution {
    public int minimumMoves(String s) {
        int count = 0;
        for(int i=0;i<s.length();)
        {
            if(s.charAt(i) == 'X')
            {
                count = count + 1;
                i = i+3;
            }
            else
            {
                i++;
            }
        }
        return count;
    }
}