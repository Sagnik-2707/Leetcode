class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        while(sb.length() < k)
        {
            StringBuilder next = new StringBuilder();
            for(int i=0;i<sb.length();i++)
            {
                char c = sb.charAt(i);
                char nextChar = (char) ((c - 'a' + 1)%26 + 'a');
                next.append(nextChar);
            }
            sb.append(next);
        }
        return sb.charAt(k - 1);
    }
}