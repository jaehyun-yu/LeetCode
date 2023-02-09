class Solution {
    public int majorityElement(int[] nums) {
        int answer = 0;

        Arrays.sort(nums);
        
        answer = nums[nums.length/2];
        
        
        
        return answer;
    }
}