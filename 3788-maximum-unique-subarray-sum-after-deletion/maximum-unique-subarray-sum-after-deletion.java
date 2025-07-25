import java.util.*;

class Solution {
    public int maxSum(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int num : nums)
        {
            if(num > 0 && !set.contains(num))
            {
                set.add(num);
                currSum += num;
            }
        }
        if(set.isEmpty())
        {
            int maxElement = nums[0];
            for(int i : nums)
            {
                maxElement = Math.max(maxElement,i);
            }
            return maxElement;
        }
        return currSum;
    }
}

    