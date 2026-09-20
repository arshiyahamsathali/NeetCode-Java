class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            // If count becomes 0, choose new candidate
            if (count == 0) candidate = num;
            // Same as candidate → increase
            if (num == candidate) count++;
            // Different → decrease
            else count--;   
        }
        return candidate;
    }
}