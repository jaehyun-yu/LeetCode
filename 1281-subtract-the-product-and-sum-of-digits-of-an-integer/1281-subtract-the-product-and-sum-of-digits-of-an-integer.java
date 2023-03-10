class Solution {
    public int subtractProductAndSum(int n) {
        String temp = n + "";
        int[] number = new int[temp.length()];
        int digit = 0;
        int sum = 0;
        for(int i = 0; i < temp.length(); i++) {
            number[i] = Character.getNumericValue(temp.charAt(i));
            if(i == 0) {
                digit = number[i];
                sum = number[i];
            } else {
                digit *= number[i];
                sum += number[i];
            }
        }
        
        return digit - sum;
    }
}