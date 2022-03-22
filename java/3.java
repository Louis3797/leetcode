class Solution {

    public int lengthOfLongestSubstring(String s) {
        
        int len = s.length();

        if(len < 2){
            return len;
        }

        HashSet<Character> set = new HashSet<>();   
        int max = 0, i = 0, j = 0;
        
        while(j < len){
            
            if(!set.contains(s.charAt(j))){
                
                set.add(s.charAt(j));
                j++;
                max = Math.max(set.size(), max);
            } else {
                
                set.remove(s.charAt(i));
                i++;
            }

    
        }
               
        return max;
    }
}
