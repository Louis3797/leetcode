class Solution {
    public int reverse(int x) {
        boolean isNegative = false;

        if (x < 0) {
            isNegative = true;
            x = -x;
        }

        long res = 0;

        if (x <= -2147483648 || x >= 2147483647) {
            return 0;
        }

        while (x > 0 || x < 0) {
            res = (res * 10) + x % 10;
            x /= 10;
        }

        if (res > Integer.MAX_VALUE) {
            return 0;
        }

        return  (int) (isNegative ? -res : res);
    }
}
