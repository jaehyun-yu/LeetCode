class Solution {
    public boolean checkIfPangram(String sentence) {
		boolean answer = true;
		Set<String> set = new HashSet<>();
		for(int i = 0; i < sentence.length(); i++) {
			set.add(Character.toString(sentence.charAt(i)));
		}
		if(set.size() != 26) {
			answer = false;
		}   
        
        return answer;
    }
}