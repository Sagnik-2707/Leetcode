import java.util.*;
class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
         paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String words[] = paragraph.split(" ");
        Map<String, Integer> wordCount = new HashMap<> ();
        for(String word : words)
        {
            if(!bannedSet.contains(word) && word.length() > 0)
            {
                wordCount.put(word, wordCount.getOrDefault(word,0)+1);
            }
        }
        String mostCommon = "";
        int max = 0;
        for(String word : wordCount.keySet())
        {
            if(wordCount.get(word) > max)
            {
                max = wordCount.get(word);
                mostCommon = word;
            }
        }
        return mostCommon;
    }
}