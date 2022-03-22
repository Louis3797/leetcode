class Solution {
    public String longestCommonPrefix(String[] strs) {

      
        if (strs.length == 0){
            return "";
        }


        if (strs.length == 1){
            return strs[0];
        }

        for(int i=0;i<strs.length; i++) {
            if(strs[i].isEmpty())
                return "";
        }

        String out = strs[0];


        for(int i = 1; i < strs.length; i++){
            out = compare(out, strs[i]);
        }
        return out;
    }
    

    public static String compare(String s1, String s2){
        int length = Math.min(s1.length(), s2.length());

        for(int i=0 ; i < length; i++){
            if(s1.charAt(i) != s2.charAt(i)) return s1.substring(0, i);
        }
        
        return s1.substring(0, length);
    }
    
}
