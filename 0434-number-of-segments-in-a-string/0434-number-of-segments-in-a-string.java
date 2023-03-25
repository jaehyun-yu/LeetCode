class Solution {
    public int countSegments(String s) {
        int answer = 0;
        if(s.length() == 0) {
            return 0;
        }
        String[] temp = s.split(" ");
        for(int i = 0; i < temp.length; i++) {
            if(temp[i].trim().length() > 0) {
                answer++;
            }
        }
        return answer;
    }
}