class Solution {
    public int maximum69Number (int num) {
        int answer = 0;
        int temp = 0;
        String snum = num + "";
        
        for(int i = 0; i < snum.length(); i++) {
            if(snum.charAt(i) == '6') {
                temp = i;
                snum = snum.substring(0,i) + "9" + snum.substring(i+1 , snum.length());
                break;
            }
        }
        return Integer.parseInt(snum);
    }
}