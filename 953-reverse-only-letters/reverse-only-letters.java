class Solution {
    public boolean isLetter(char c)
    {
        if(Character.isLetter(c) == true)
            return true;
        return false;
    }
    public String reverseOnlyLetters(String s) {
        char str[] = s.toCharArray();
        int i=0;
        int k = str.length - 1;
        while(i<=k)
        {
            if(!isLetter(str[i]))
            {
                i++;
            }
            else if(!isLetter(str[k]))
            {
                k--;
            }
            else
            {
                if(isLetter(str[i]) && isLetter(str[k]))
                {
                    char temp = str[i];
                    str[i] = str[k];
                    str[k] = temp;
                }
                i++;
                k--;
            }
        }
        return new String(str);
    }
}