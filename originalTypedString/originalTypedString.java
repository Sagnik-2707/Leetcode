package originalTypedString;

public class originalTypedString {
    
}
class Solution {
    public int possibleStringCount(String word) {
        if(word == null || word.length() == 0)
            return 0;
        int finalcount= 1;
        int count = 0;
        char c,d;
        int l = word.length();

        for (int i = 0; i < l-1; i++) 
        {
            c = word.charAt(i);
            d = word.charAt(i+1);
            if(c==d)
            {
                count = count + 1;
            }
            else 
            {
                finalcount+=count;
                count = 0; // reset when characters are different
            }
        }
        finalcount+=count;
        return finalcount;
    }
}
