class Solution {
    public int minSteps(String s, String t) {
        int freq_diff[] = new int[26];
        int n = freq_diff.length;
        if(s.length() != t.length())
            return 0;
        for(int i=0;i<s.length();i++)
        {
            freq_diff[s.charAt(i) - 'a']++;
            freq_diff[t.charAt(i) - 'a']--;
        }
        int result = 0;
        for(int i=0;i<n;i++)
        {
            if(freq_diff[i] > 0)
            {
                result = result + freq_diff[i];
            }
        }
        return result;
    }
}