import java.util.HashSet;
import java.util.Set;
class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        for(int i = 0; i < nums.length; i++) {
            answer ^= nums[i];
        }
        return answer;
    }
}