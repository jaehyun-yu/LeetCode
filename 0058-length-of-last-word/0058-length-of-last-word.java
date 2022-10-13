class Solution {
    public int lengthOfLastWord(String s) {
        int answer = 0;
        String[] temp = s.split(" ");
        answer = temp[temp.length -1].length();
        
        return answer;
    }
}