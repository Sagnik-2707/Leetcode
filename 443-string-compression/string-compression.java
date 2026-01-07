class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;
        int i = 0;
        while(i<n)
        {
            char current = chars[i];
            int count = 0;
            while(i<n && chars[i] == current)
            {
                count++;
                i++;
            }
            chars[index] = current;
            index++;
            if(count>1)
            {
                String count_char = Integer.toString(count);
                for(char ch : count_char.toCharArray())
                {
                    chars[index] = ch;
                    index++;
                }
            }
        }
        return index;
    }
}