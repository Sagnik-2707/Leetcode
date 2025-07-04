class Solution {
    public boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        //s = s.trim();
        char chr[] = s.toCharArray();
        int start = 0;
        int end = chr.length - 1;
        while(start<=end)
        {
            if(!isVowel(chr[start]))
            {
                start++;
            }
            else if(!isVowel(chr[end]))
            {
                end--;
            }
            else
            {
                if(isVowel(chr[start]) && isVowel(chr[end]))
                {
                    char temp = chr[start];
                    chr[start] = chr[end];
                    chr[end] = temp;
                    start++;
                    end--;
                }
            }
        }
        return new String(chr); // ✅ Correct: returns the modified string

    }
}