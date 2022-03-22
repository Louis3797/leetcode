class Solution {
    public double myPow(double x, int n) {
        if(n == 0) return 1.0;
        
        if(n == 1) return x;
        
        if(n > 0){
            if(n % 2 == 0){
                double y = myPow(x, n / 2);
                return y * y;
            }else{
                double y = myPow(x, n - 1);
                return y * x;
            }
        }else {
            if(n % 2 == 0){
                double y = myPow(x, n / 2);
                return y * y;
            }else{
                double y = myPow(x, n + 1);
                return y / x;
            }
        }
    }
}
