class Solution {
    public boolean closeStrings(String word1, String word2) {
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        int n = word1.length();
        int m = word2.length();
        if(m!=n)
            return false;
        for(int i=0;i<n;i++)
        {
            char ch1 = word1.charAt(i);
            char ch2 = word2.charAt(i);
            int idx1 = ch1 - 'a';
            int idx2 = ch2 - 'a';
            freq1[idx1]++;
            freq2[idx2]++;
        }

        for(int i=0;i<freq1.length;i++)
        {
            if((freq1[i] == 0 && freq2[i] != 0) || (freq1[i] != 0 && freq2[i] ==0))
                return false;
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        return Arrays.equals(freq1, freq2);
    }
}