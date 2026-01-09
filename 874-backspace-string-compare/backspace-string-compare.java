class Solution {
    public boolean backspaceCompare(String s, String t) {
        int m = s.length();
        int n = t.length();
        int i = m - 1;
        int k = n - 1;
        int skip_s = 0;
        int skip_t = 0;
        while(i>=0 || k>=0)
        {
            while(i>=0)
            {
                if(s.charAt(i) == '#')
                {
                    skip_s++;
                    i--;
                }
                else if(skip_s > 0)
                {
                    skip_s--;
                    i--;
                }
                else
                {
                    break;
                }
            }
             while(k>=0)
            {
                if(t.charAt(k) == '#')
                {
                    skip_t++;
                    k--;
                }
                else if(skip_t > 0)
                {
                    skip_t--;
                    k--;
                }
                else
                {
                    break;
                }
            }
            char first = i<0? '$':s.charAt(i);
            char second = k<0? '$':t.charAt(k);

            if(first != second)
                return false;
            i--;
            k--;
        }
        return true;
    }
}