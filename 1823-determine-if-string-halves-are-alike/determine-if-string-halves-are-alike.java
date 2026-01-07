class Solution {
    private boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        return false;
    }
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n/2;
        int i=0;
        int k = mid;
        int leftCount=0, rightCount = 0;
        while(i<n/2 && k<n)
        {
            if(isVowel(s.charAt(i)))
                leftCount++;
            if(isVowel(s.charAt(k)))
                rightCount++;
            i++;
            k++;
        }
        if(leftCount == rightCount)
            return true;
        return false;
    }
}