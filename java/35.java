class Solution {
    public int searchInsert(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }
    
    public int binarySearch(int[] arr, int target, int left, int right) {

        if (left >= right) {
            if(target > arr[left]){
                return left +1;
            }else{
                return left;
            }
        }

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, left, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, right);
        }
    }
}
