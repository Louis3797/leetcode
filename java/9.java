class Solution {
    public boolean isPalindrome(int x) {
        
        return Integer.toString(x).equals(new StringBuilder(Integer.toString(x)).reverse().toString());
    }
}
