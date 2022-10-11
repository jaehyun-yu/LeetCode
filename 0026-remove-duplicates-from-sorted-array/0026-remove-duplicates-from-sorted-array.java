class Solution {
    public int removeDuplicates(int[] nums) {
        int answer = 0;
        int temp = 0;
        
        for(int i = 0; i < nums.length; i++) {
            if (i ==0 ){
                nums[answer] = nums[i];
                temp = nums[i];
                answer++;
            } else if (temp != nums[i]){
                nums[answer] = nums[i];
                temp = nums[i];
                answer++;
            }
        }
        return answer;
    }
}