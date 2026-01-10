class Solution {
    public long countSubstrings(String s, char c) {
        long count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == c)
                count++;
        }
        long result = ((count)*(count+1))/2;
        return result;
    }
}