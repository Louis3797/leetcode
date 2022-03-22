class Solution {
    public int firstMissingPositive(int[] arr) {
       
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            
            if(arr[i] > 0 && arr[i] <= n){
                
                if(arr[i] - 1 != i && arr[arr[i] - 1] != arr[i]){
                    
                    int temp = arr[arr[i]-1];
                    
                    arr[arr[i] - 1] = arr[i];
                    
                    arr[i] = temp;
                    
                    i--;
                }
            }
        }
        
        for(int i = 0; i < n; i++)
            
            if(arr[i] != i + 1) { 
                
                return i + 1;
            }

        return n + 1;
    }
}
