package leet.code.pow;

public class Solution {

    /**
     Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

     Constraints:
     -100.0 < x < 100.0
     -231 <= n <= 231-1
     -104 <= xn <= 104
     */
    public double myPow(double x, int n) {
        if (x == 1) return 1;
        if (x == -1) {
            if (n % 2 == 0) return 1;
            else return -1;
        }
        double result = 1d;
        int counter = Math.abs(n);
        if (n > 0) {
            while (counter > 0) {
                result *= x;
                counter--;
                if (result > 1 && Math.abs(result) > 10000) return 0;
                if (result < 1 && Math.abs(result) < 0.00001) return 0;
            }
            return result;
        }
        if (n < 0) {
            while (counter > 0) {
                result /= x;
                counter--;
                if (result > 1 && Math.abs(result) > 10000) return 0;
                if (result < 1 && Math.abs(result) < 0.00001) return 0;
            }
            return result;
        }
        return 1;
    }
}
