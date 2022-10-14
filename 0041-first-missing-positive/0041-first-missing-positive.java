class Solution {
    public int firstMissingPositive(int[] nums) {
		int answer = 0;
		Set<Integer> set = new HashSet<>();
		Arrays.sort(nums);

		if (nums[nums.length -1] > 0) {
			for(int i = 0; i < nums.length; i++) {
				if(nums[i] > 0) {
					set.add(nums[i]);
				}
			}
		} else {
			return 1;
		}
		
		if (!set.isEmpty()) {
			int min = 1;
			for(int i = 0; i < set.size()+1; i++) {
				if(set.contains(min) == true) {
					min++;
				} else {
					answer = min;
					break;
				}
			}			
		}
        return answer;
    }
}