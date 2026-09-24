class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";

        // Count frequency of t
        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }

        int[] window = new int[128];
        int left = 0, right = 0;
        int required = t.length(); // total chars needed
        int formed = 0;            // how many matched so far
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            window[c]++;

            // If this char is still useful (not extra)
            if (need[c] > 0 && window[c] <= need[c]) {
                formed++;
            }

            // Try to shrink from left
            while (formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window[leftChar]--;
                if (need[leftChar] > 0 && window[leftChar] < need[leftChar]) {
                    formed--;
                }
                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
