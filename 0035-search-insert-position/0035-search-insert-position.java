class Solution {
    public int searchInsert(int[] nums, int target) {
        int answer = 0; //1,3,5,6
        
        if(target == 0 && target <= nums[0]) {
        	return 0;
        } else if (target > nums[nums.length-1]) {
            return nums.length;    
        }
        else if (nums.length == 1) {
            if(nums[0] < target) {
                answer = 1;
            } else {
                answer= 0;
            }
        } else {
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] >= target) {
                    answer = i;
                    break;
                }
            }
        }     
        return answer;
    }
}