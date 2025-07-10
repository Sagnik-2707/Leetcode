import java.util.*;
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<> ();
        for(int num : arr)
        {
            freq.put(num, freq.getOrDefault(num,0) + 1);
        }
        int max = -1;
        for(Map.Entry<Integer, Integer> e : freq.entrySet())
        {
           if(e.getKey() > max && e.getKey().equals(e.getValue()))
           {
                max = e.getKey();
           }
        }
        return max;
    }
}