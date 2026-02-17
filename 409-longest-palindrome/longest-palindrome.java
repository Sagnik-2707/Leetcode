class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        for(char ch : s.toCharArray())
        {
            if(set.contains(ch))
            {
                set.remove(ch);
                result += 2;
            }
            else
            {
                set.add(ch);
            }
        }
        if(!set.isEmpty())
        {
            result = result + 1;
        }
        return result;
    }
}