class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length() > haystack.length())
            return -1;
        int len1 = needle.length();
        int len2 = haystack.length();
        for(int i=0;i<len2;i++)
        {       if(i+len1 <= len2)
                {
                    if(haystack.substring(i,(i+len1)).equalsIgnoreCase(needle))
                    {
                     return i;
                    }
                }
        }
        return -1;
    }
}