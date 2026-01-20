import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<> ();
        int n = nums.length;
        for(int num : nums)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        ArrayList<Integer> [] bucket = new ArrayList[n+1];
        for(int i=0;i<=n;i++)
        {
            bucket[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer, Integer> it : freq.entrySet())
        {
            int element = it.getKey();
            int frequency = it.getValue();
            bucket[frequency].add(element);
        }
        int result [] = new int[k];
        int index = 0;
        for(int i=n; i>=0 && k>0 ; i--)
        {
            if(bucket[i].isEmpty()) continue;
            while(!bucket[i].isEmpty() && k>0)
            {
                result[index++] = bucket[i].remove(bucket[i].size() - 1);
                k--;
            }
        }
        return result;
    }
}

