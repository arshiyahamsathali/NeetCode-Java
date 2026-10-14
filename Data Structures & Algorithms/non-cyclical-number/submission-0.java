class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1) {
            // If the number repeats, a cycle exists
            if (seen.contains(n)) return false;
            seen.add(n);
            int sum = 0;
            // Calculate the sum of squared digits
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            // Start the next iteration with the new number
            n = sum;
        }
        return true;
    }
}
