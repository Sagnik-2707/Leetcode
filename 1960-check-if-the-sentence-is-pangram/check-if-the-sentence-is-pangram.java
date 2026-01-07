class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        int freq[] = new int[26];
        for(int i=0;i<n;i++)
        {
            char ch = sentence.charAt(i);
            int index = ch - 'a';
            freq[index]++;
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i] == 0)
                return false;
        }

        return true;
    }
}