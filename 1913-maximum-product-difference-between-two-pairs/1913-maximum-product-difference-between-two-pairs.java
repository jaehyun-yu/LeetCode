class Solution {
    public int maxProductDifference(int[] nums) {
        int answer = 0;
        Arrays.sort(nums); //2 4 5 6 7
        answer = (nums[nums.length -1] * nums[nums.length -2]) - (nums[0] * nums[1]);
        return answer;
    }
}