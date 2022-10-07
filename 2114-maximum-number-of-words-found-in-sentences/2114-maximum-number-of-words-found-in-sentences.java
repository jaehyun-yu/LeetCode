class Solution {
    public int mostWordsFound(String[] sentences) {
        int answer = 0;
        for(int i = 0; i < sentences.length; i++) {
        	int temp = 0;
            for(int j = 0; j < sentences[i].length(); j++) {
            	if (sentences[i].charAt(j) == ' ') {
            		temp++;
            	}
            }
            System.out.println(answer);
            if (answer < temp ) {
            	answer = temp;
            }           
        }
        answer++;
        return answer;
    }
}