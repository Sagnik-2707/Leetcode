class Solution {
    private boolean checkFreq(String str)
    {
        int freq[] = new int[26];
        for(char ch : str.toCharArray())
        {
            freq[ch - 'a']++;
            if(freq[ch - 'a'] > 1)
                return true;
        }
        return false;
    }

    public boolean buddyStrings(String s, String goal) {
       if(s.length() != goal.length())
        return false;
        if(s.equals(goal))
        {
            return checkFreq(s);
        }

        ArrayList<Integer> index = new ArrayList <> ();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != goal.charAt(i))
            {
                index.add(i);
            }
        }
        if(index.size() != 2)
            return false;
           
        char str[] = s.toCharArray();
        char temp = str[index.get(0)];
        str[index.get(0)] = str[index.get(1)];
        str[index.get(1)] = temp;

        return new String(str).equals(goal);
    }
}