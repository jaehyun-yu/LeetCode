class Solution {
    public int thirdMax(int[] nums) {
		int answer = 0;
		HashSet<Integer> temp = new HashSet<>();
		for(int i = 0; i < nums.length; i++) {
			temp.add(nums[i]);
		}
		ArrayList<Integer> list = new ArrayList<>(temp);
		Collections.sort(list);
        if(list.size() >= 3) {
			answer = list.get(list.size()-3);
		} else {
			answer = list.get(list.size()-1);
		}
        
        return answer;   
    }
}