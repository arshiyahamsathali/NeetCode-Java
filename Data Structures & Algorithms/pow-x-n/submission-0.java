class Solution {
    public double myPow(double x, int n) {
        long power = n;   // Convert to long for MIN_VALUE case
        // Handle negative exponent
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }
        double answer = 1.0;
        while (power > 0) {
            // If power is odd
            if (power % 2 == 1) {
                answer = answer * x;
            }
            // Square the base
            x = x * x;
            // Divide power by 2
            power = power / 2;
        }
        return answer;
    }
}