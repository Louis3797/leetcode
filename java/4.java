class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if (nums1.length == 0 && nums2.length == 0){
            return 0.0;
        }
        
        int[] mergedArr = mergeSort(nums1, nums2);

        int len = mergedArr.length;

        if (len % 2 == 0){ 
            int sum = mergedArr[len / 2] + mergedArr[(len/2) - 1];
            return (double) sum/2;
        }else{
            return mergedArr[len / 2];
        }
    }

    public int[] mergeSort(int[] nums1, int[] nums2) {

        int len1 = nums1.length, len2 = nums2.length;

        int[] mergedArr = new int[len1 + len2];

        int i = 0, j = 0, count = 0;

        while (i < len1 && j < len2) {

            // add smallest element to mergedArray
            if (nums1[i] < nums2[j]) {
                mergedArr[count] = nums1[i++];
            } else {
                mergedArr[count] = nums2[j++];
            }

            // increment count
            count++;
        }



        if (i == len1) {

            while (j < len2) {
                mergedArr[count++] = nums2[j++];
            }
        }

        if (j == len2) {

            while (i < len1) {
                mergedArr[count++] = nums1[i++];
            }
        }

        return mergedArr;
    }
}
