import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for(int i=n-1;i>0;i--)
        {
            if(nums[i] > nums[i-1])
            {
                index = i-1;
                break;
            }
        }
        if(index != -1)
        {
            int swap_index = index;
            for(int k=n-1;k>=index;k--)
            {
                if(nums[k] > nums[index])
                {
                    swap_index = k;
                    break;
                }
            }
            int temp = nums[index];
            nums[index] = nums[swap_index];
            nums[swap_index] = temp;
        }
        int left = index + 1, right = n - 1;
        while (left < right) 
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}