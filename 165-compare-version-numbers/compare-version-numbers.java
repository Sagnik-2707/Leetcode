class Solution {
    public int compareVersion(String version1, String version2) {
        String v1[] = version1.split("\\.");
        String v2[] = version2.split("\\.");
        int i = 0;
        int m = v1.length;
        int n = v2.length;
        while(i<m || i<n)
        {
            int a = i<m ? Integer.parseInt(v1[i]): 0;
            int b = i<n ? Integer.parseInt(v2[i]): 0;
            if(a>b)
                return 1;
            else if(a<b)
                return -1;
            else
                i++;
        }
        return 0;
    }
}