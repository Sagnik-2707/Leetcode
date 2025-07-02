class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty() == true)
            return true;
        //s = s.trim();
        s = s.toUpperCase();
        int start = 0;
        int end = s.length() - 1;
        while(start<=end)
        {
            char c1 = s.charAt(start);
            char c2 = s.charAt(end);
            if(!Character.isLetterOrDigit(c1))
            {
                start = start + 1;
            }
            else if(!Character.isLetterOrDigit(c2))
            {
                end = end - 1;
            }
            else
            {
                if(c1 != c2)
                    return false;
                start++;
                end--;
            }
        }
        return true;
    }
}