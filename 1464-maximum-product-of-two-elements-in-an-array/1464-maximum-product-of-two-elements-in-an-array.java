class Solution {
    public int maxProduct(int[] nums) {
        int answer = 0;
        
        if(nums.length == 2) {
            return (nums[0]-1)*(nums[1]-1);
        } else {
            for(int i = 0; i < nums.length-1; i++) {
                for(int j = i+1; j < nums.length; j++) {
                    if((nums[i]-1) * (nums[j]-1) > answer) {
                        answer = (nums[i]-1) * (nums[j]-1);
                    }
                }
            }      
        }                
        return answer;
    }
}