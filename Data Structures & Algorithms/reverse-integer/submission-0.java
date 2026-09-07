class Solution {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int digit = x % 10;   // Step 1: extract last digit
            x = x / 10;           // Step 2: remove last digit
            // Step 3: check overflow before multiplying by 10
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rev = rev * 10 + digit; // Step 4: build reversed number
        }
        return rev;
    }
}
