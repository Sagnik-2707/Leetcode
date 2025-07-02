class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0)
            return 0;
        s = s.trim(); // Remove leading and trailing spaces
        String[] words = s.split(" ");
        return words[words.length - 1].length(); // Return length of last word
    }
}
