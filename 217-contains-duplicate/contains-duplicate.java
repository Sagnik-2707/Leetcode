class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<> ();
        for(int num : nums)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for(int num : freq.keySet())
        {
            if(freq.get(num) != 1)
                return true;
        }
        return false;
    }
}