class Solution {
    public boolean isVowel(char ch)
    {
        ch = Character.toUpperCase(ch);
        if(ch == 'A' ||ch == 'E'||ch == 'I' || ch == 'O' || ch == 'U')
            return true;
        return false;
    }
    public String toGoatLatin(String sentence) {
        sentence = sentence.trim();
        sentence = sentence + " ";
        int l = sentence.length();
        char c;
        String a="", x="";
        int count = 0;
        for(int i=0;i<l;i++)
        {
            c = sentence.charAt(i);
            if(c != ' ')
            {
                a = a + c;
            }
            else
            {
                count = count + 1;
                if(isVowel(a.charAt(0)))
                {
                    x = x + a + "ma";
                }
                else
                {
                    x = x + a.substring(1) + a.charAt(0) + "ma";
                }
                for(int k=0;k<count;k++)
                {
                    x = x + "a";
                }
                x = x + " ";
                a="";
            }
        }
        return x.trim();
    }
}