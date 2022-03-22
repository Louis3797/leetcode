class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        if(nums.length == 0){ 
            return new int[]{-1,-1};
        }
        
        
        int first = 0;
        int last = nums.length-1;
        
        while(first < last){
            
            if(nums[first] != target){
                first++;
            }
            
            if(nums[last] != target){
                last--;
            }
            
            if(nums[first] == target && nums[last] == target){
                return new int[]{first, last};
            }
        }
        
        if(nums[first] == target){
            return new int[]{first, first};
            
        }else if(nums[last] == target){
            return new int[]{last, last};
            
        }else{
            return new int[]{-1,-1};
            
        }
    }
}
