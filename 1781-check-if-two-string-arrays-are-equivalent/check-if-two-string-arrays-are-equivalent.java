class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String result1 = "";
        String result2 = "";
        for(int i=0;i<word1.length;i++)
        {
            result1 = result1 + word1[i];
        }
        for(int k=0;k<word2.length;k++)
        {
            result2 = result2 + word2[k];
        }
        if(result1.equals(result2))
            return true;
        return false;
    }
}