class Solution {
    public int search(int[] nums, int target) {
		int answer = 0;
		
		answer = IntStream.range(0, nums.length)
				.filter(i -> target == nums[i])
				.findFirst()
				.orElse(-1);
		
        return answer;
    }
}