class Solution {
    public boolean isPalindrome(int x) {
        String num = Integer.toString(x);
        String rev = "";
        int l = num.length();
        char c;
        for(int i=0;i<l;i++)
        {
            c = num.charAt(i);
            rev = c + rev;
        }
    return (rev.equals(num));
    }
}