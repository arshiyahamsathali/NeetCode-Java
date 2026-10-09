class Solution {
    public String multiply(String num1, String num2) {

        // If either number is zero, product is zero
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int m = num1.length();
        int n = num2.length();
        // Product can have at most m + n digits
        int[] result = new int[m + n];
        // Start from the last digits
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                // Convert characters into individual digits
                int digit1 = num1.charAt(i) - '0';
                int digit2 = num2.charAt(j) - '0';
                int product = digit1 * digit2;
                // Positions for carry and current digit
                int sum = product + result[i + j + 1];
                result[i + j + 1] = sum % 10;
                result[i + j] += sum / 10;
            }
        }
        // Convert result array into a string
        StringBuilder answer = new StringBuilder();
        for (int digit : result) {
            // Skip leading zeros
            if (answer.length() == 0 && digit == 0) {
                continue;
            }
            answer.append(digit);
        }
        return answer.toString();
    }
}