class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        backtrack(0, nums, current, result);

        return result;
    }

    void backtrack(int index, int[] nums,
                   List<Integer> current,
                   List<List<Integer>> result) {

        // All elements have been considered
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Choice 1: Include the current element
        current.add(nums[index]);
        backtrack(index + 1, nums, current, result);

        // Backtrack: Remove the element
        current.remove(current.size() - 1);

        // Choice 2: Skip the current element
        backtrack(index + 1, nums, current, result);
    }
}
