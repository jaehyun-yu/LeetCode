class Solution {
    public String solution(String s, int n) {
        String answer = "";
        //소문자 97~122 // 대문자 65~90 //
        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(temp != ' ') {
                int ascll = temp - 0;
                ascll += n;
                if(ascll > 122 && (ascll-n <= 122)) {
                    ascll = (ascll - 123) + 97;
                    System.out.println(ascll);
                    answer += Character.toString((char)ascll);
                } else if(ascll > 90 && ascll-n <= 90) {
                	ascll = (ascll - 91) + 65;
                	System.out.println(ascll);
                	answer += Character.toString((char)ascll);
                } else {
                	answer += Character.toString((char)ascll);                 	
                }
            } else {
                answer += " ";
            }			
        }            
        return answer;
    }
}