class Solution {
    public boolean isPalindrome(String s) {
        int l = s.length();
        String x = "", rev = "";
        for(int i=0;i<l;i++)
        {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c))
                x = x + c;
        }
        for(int i=0;i<x.length();i++)
        {
            rev = x.charAt(i) + rev;
        }
        return x.equalsIgnoreCase(rev);
        
    }
}