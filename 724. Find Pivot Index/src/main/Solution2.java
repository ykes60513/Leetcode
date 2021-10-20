package main;

public class Solution2 {
    public int pivotIndex(int[] nums) {
        
        int sum = 0;
        
        for(int i : nums)
            sum += i;
        
        int preSum = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            if(preSum == sum - nums[i] - preSum)
                return i;
            
            preSum += nums[i];
        }
        
        return -1;
    }
}