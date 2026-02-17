class Solution {
    public void fillCountArray(String word, int count[])
    {
        for(char ch: word.toCharArray())
        {
            count[ch - 'a']++;
        }
    }
    public List<String> commonChars(String[] words) {
        ArrayList<String> result = new ArrayList<>();
        int n = words.length;
        int count[] = new int[26];
        fillCountArray(words[0], count);
        for(int i=1;i<n;i++)
        {
            int temp[] = new int[26];
            fillCountArray(words[i], temp);
            for(int k=0;k<26;k++)
            {
                count[k] = Math.min(count[k], temp[k]);
            }
        }
        for(int i=0;i<26;i++)
        {
            if(count[i]>0)
            {
                for(int k=0;k<count[i];k++)
                {
                    result.add(String.valueOf((char) (i+'a')));
                }
            }
        }
        return result;
    }
}