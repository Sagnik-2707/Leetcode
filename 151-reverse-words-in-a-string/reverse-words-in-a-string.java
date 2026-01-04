class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        s = s + " ";
        String a = "", x = "";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != ' ')
            {
                a = a + s.charAt(i);
            }
            else
            {
                x = a + " " + x;
                a="";
            }
        }
        return x.trim().replaceAll("\\s+", " ");
    }
}