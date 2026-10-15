/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        // Step 1: Sort by start time
        intervals.sort((a, b) -> a.start - b.start);

        // Step 2: Check conflicts
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start < intervals.get(i - 1).end) {
                return false; // Conflict found
            }
        }
        return true; // No conflicts
    }
}