class Solution {
    public boolean isUgly(int n) {

        boolean answer = true;
        if (n == 0) {
        	answer = false;
        } else if (n == 1) {
        	answer = true;
        } else if (n < 0) {
        	answer = false;
        } else {       	
        	while (true) {  
        		if (n % 5 == 0) {
        			n = n/5;
        			continue;
        		} else if (n % 3 == 0) {
        			n = n/3;
        			continue;
        		} else if (n % 2 == 0) {
        			n = n/2;
        			continue;
        		} else {
        			if (n == 1 || n == 2 || n == 3 || n == 5) {}
        			else {
        				answer = false;
        				break;
        			}
        		}
        		break;
        	}      			
        }
        return answer;      
    }
}