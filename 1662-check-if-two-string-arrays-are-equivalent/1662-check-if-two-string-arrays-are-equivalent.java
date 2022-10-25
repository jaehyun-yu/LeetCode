class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean answer = false;
        String temp1 = "";
        String temp2 = "";
        
        for(int i = 0; i < word1.length; i++) {
            temp1 += word1[i];
        }
        
        for(int i = 0; i < word2.length; i++) {
        	temp2 += word2[i];
        }
        
        if(temp1.length() != temp2.length()) {
        	answer = false;
        } else {
        	for(int i = 0; i < temp1.length(); i++) {
        		if(temp1.charAt(i) != temp2.charAt(i)) {
        			answer  = false;
        			break;
        		} else {
        			answer = true;
        		}
        	}
        }
        
        return answer;
    }
}