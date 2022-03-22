class Solution {
    public int maxArea(int[] height) {
        

        int maxA = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int min = Math.min(height[i], height[j]);

            maxA = Math.max(maxA, min * (j - i));

            if(height[i] <= height[j]){
                i++;
            }else{
                j--;
            }

        }


        return maxA;
    }
}
