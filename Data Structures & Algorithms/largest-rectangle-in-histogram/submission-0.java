class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        // i <= heights.length
        // At i == heights.length, we use height 0
        // to force remaining bars out of the stack.
        for (int i = 0; i <= heights.length; i++) {
            int currentHeight;
            if (i == heights.length) {
                currentHeight = 0;
            } else {
                currentHeight = heights[i];
            }
            // Remove bars that are taller than current bar
            while (!stack.isEmpty()
                    && currentHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }
                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }
            // Store the index
            stack.push(i);
        }
        return maxArea;
    }
}