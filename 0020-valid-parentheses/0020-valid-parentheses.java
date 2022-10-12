class Solution {
    public boolean isValid(String s) {
        boolean answer = false;
        char[] ch = s.toCharArray(); 
        Stack<Character> stack = new Stack<>();
        if (ch[0] == ')' || ch[0] == '}' || ch[0] == ']') {
            return false;
        }
        for(int i = 0; i < ch.length; i++) {
            char temp = ch[i];
            if(temp == '(' ||  temp == '{' || temp == '['){
                stack.push(temp);
            } else if(temp == ')' ||  temp == '}' || temp == ']') {
                if(stack.isEmpty()){
                    return false;
                } else {
                    if(temp == ')' && stack.peek() == '('){
                        stack.pop();
                    } else if(temp == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else if(temp == ']' && stack.peek() == '[') {
                       stack.pop(); 
                    } else {
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty()){
             answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}