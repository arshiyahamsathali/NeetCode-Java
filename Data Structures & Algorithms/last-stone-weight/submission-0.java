class Solution {
    public int lastStoneWeight(int[] stones) {
        // Create a Max Heap
        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());
        // Add all stones to the heap
        for (int stone : stones) {
            pq.add(stone);
        }
        // Continue until only one or zero stones remain
        while (pq.size() > 1) {
            // Get the two heaviest stones
            int x = pq.poll();
            int y = pq.poll();
            // If they are different, add the remaining weight
            if (x != y) {
                pq.add(x - y);
            }
        }
        // If no stones remain, return 0
        // Otherwise return the remaining stone
        return pq.isEmpty() ? 0 : pq.peek();
    }
}
