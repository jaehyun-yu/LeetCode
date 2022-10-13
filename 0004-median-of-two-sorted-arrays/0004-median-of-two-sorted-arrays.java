class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double answer = 0;
        int[] temp = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, temp, 0, nums1.length);
        System.arraycopy(nums2, 0, temp, nums1.length, nums2.length);
        
        Arrays.sort(temp);
        if(temp.length % 2 == 0) {
            answer = (double)(temp[temp.length / 2] + temp[(temp.length / 2) - 1]) / 2;
        } else {
        	answer = (double) temp[temp.length / 2];
        }
        return answer;
        
    }
}