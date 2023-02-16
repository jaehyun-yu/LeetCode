import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
class Solution {
    public int[] solution(int[] numbers) {
		int[] answer = {};
		ArrayList<Integer> arList = new ArrayList<Integer>();
		Arrays.sort(numbers); 
		for(int i = 0; i < numbers.length; i++) {
			for(int j = i+1; j < numbers.length; j++) {
				int temp = numbers[i] + numbers[j];
				arList.add(temp);
			}			
		}
		Collections.sort(arList);
		HashSet<Integer> tempSet = new HashSet<Integer>(arList);
		arList = new ArrayList<Integer>(tempSet);
		answer = new int[arList.size()];
		for(int i = 0; i < arList.size(); i++) {
			answer[i] = arList.get(i);
		}
        Arrays.sort(answer);
        return answer;
    }
}