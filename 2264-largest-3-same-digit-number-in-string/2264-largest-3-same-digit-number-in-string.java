class Solution {
    public String largestGoodInteger(String num) {
        String answer = "";
        int temp = 0;
        
        for(int i = 0; i < num.length()-2; i++) {
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i) == num.charAt(i+2)) {
                if(temp <= Character.getNumericValue(num.charAt(i))) {
                    temp = Character.getNumericValue(num.charAt(i));
                    answer = String.valueOf(num.charAt(i)) + String.valueOf(num.charAt(i)) + String.valueOf(num.charAt(i));
                }
            }
        }
        
        
                   
        return answer;
    }
    
}