class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < words.length; i++) {
            if(words[i].indexOf(x) >= 0) {
                answer.add(i);
            }
        }     
        
        return answer;
    }
}