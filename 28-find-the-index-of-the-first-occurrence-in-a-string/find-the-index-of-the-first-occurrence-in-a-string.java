class Solution {
    public int strStr(String haystack, String needle) {
       int n = haystack.length();
       int m = needle.length();
       for(int i=0;i<=n-m;i++)
       {
           for(int k=0;k<m;k++)
           {
            if(haystack.charAt(i+k) != needle.charAt(k))
                break;
            if(k == m-1)
                return i;
           }
       }
       return -1;
    }
}