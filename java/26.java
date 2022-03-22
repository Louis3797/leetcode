class Solution {
    public int removeDuplicates(int[] nums) {
        int counter = 0;

         for (int i = 0; i < nums.length; i++) {
            // If the current element is equal to the next element, we skip
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            // We will update the array in place
            nums[counter] = nums[i];
            counter++;
        }
 
        return counter;
        
        
    }
}
