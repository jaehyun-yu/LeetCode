class Solution {
    public int differenceOfSum(int[] nums) {
        int temp1 = 0;
        int temp2 = 0;
        
        for(int i = 0; i < nums.length; i++) {
            temp1 += nums[i];
            while(nums[i] > 9) {
                temp2 += nums[i]%10;
                nums[i] = nums[i]/10;
                
            }
            temp2 += nums[i];
        }
        
        return Math.abs(temp1 - temp2);
    }
}