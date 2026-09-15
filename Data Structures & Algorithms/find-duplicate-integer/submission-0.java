class Solution {
    public int findDuplicate(int[] nums) {

        // Step 1: Find the meeting point
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];          // moves 1 step
            fast = nums[nums[fast]];    // moves 2 steps
        } while (slow != fast);

        // Step 2: Find the entrance of the cycle
        slow = nums[0];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}