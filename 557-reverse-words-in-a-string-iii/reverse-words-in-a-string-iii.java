class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s + " ";
        String a="", x="";
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            char c = s.charAt(i);
            if(c != ' ')
            {
                a = c + a;
            }
            else
            {
                x = x + a + " ";
                a="";
            }
        }
        return x.trim();
    }
}