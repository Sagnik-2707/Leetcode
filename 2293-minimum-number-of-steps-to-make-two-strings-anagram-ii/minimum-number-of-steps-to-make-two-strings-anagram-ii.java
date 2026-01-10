class Solution {
    public int minSteps(String s, String t) {
        int freq_map[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq_map[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++)
        {
            freq_map[t.charAt(i) - 'a']--;
        }
        int result = 0;
        for(int i=0;i<26;i++)
        {
            result = result + Math.abs(freq_map[i]);
        }
        return result;
    }
}