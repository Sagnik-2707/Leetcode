class Solution {
    private boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        return false;
    }
    public String reverseVowels(String s) {
        char str[] = s.toCharArray();
        int n = str.length;
        int p1=0;
        int p2 = n-1;
        while(p1<p2)
        {
            if(!isVowel(str[p1]))
                p1++;
            else if(!isVowel(str[p2]))
                p2--;
            else
            {
                char temp = str[p1];
                str[p1] = str[p2];
                str[p2] = temp;

                p1++;
                p2--;
            }
        }
        return new String(str);
    }
}