class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean answer = false;
        int temp = nums.length;
        
        nums = Arrays.stream(nums).distinct().toArray();
        
        if (temp != nums.length){
            answer = true;
        }
        return answer;
    }
}