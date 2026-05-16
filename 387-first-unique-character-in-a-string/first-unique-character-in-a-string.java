class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        Map<Character, Integer> freq = new HashMap<> ();
        for(int i=0;i<n;i++)
        {
            char c = s.charAt(i);
            freq.put(c, freq.getOrDefault(c,0) + 1);
        }
        for(int i=0;i<n;i++)
        {
            if(freq.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}