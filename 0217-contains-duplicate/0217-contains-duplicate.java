class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean answer = false;
        Set<Integer> tempSet = new HashSet<>();
        
        for(int i = 0; i < nums.length; i++) {
            tempSet.add(nums[i]);
        }
        
        if(nums.length != tempSet.size()) {
            answer = true;
        }
        return answer;
    }
}