
class TimeMap {

    // Stores:
    // key -> list of timestamp/value pairs
    private Map<String, List<Pair>> map;

    // Constructor
    public TimeMap() {
        map = new HashMap<>();
    }

    // Stores key, value and timestamp
    public void set(String key, String value, int timestamp) {

        // If key doesn't exist, create a new list
        map.putIfAbsent(key, new ArrayList<>());

        // Add the new timestamp and value
        map.get(key).add(new Pair(timestamp, value));
    }

    // Returns the value at the latest timestamp <= given timestamp
    public String get(String key, int timestamp) {

        // If key doesn't exist
        if (!map.containsKey(key)) {
            return "";
        }

        List<Pair> list = map.get(key);

        int left = 0;
        int right = list.size() - 1;

        String answer = "";

        // Binary Search
        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (list.get(mid).timestamp <= timestamp) {

                // This is a valid answer
                answer = list.get(mid).value;

                // Try to find a later valid timestamp
                left = mid + 1;

            } else {

                // Timestamp is too large
                right = mid - 1;
            }
        }

        return answer;
    }

    // Class to store timestamp + value
    private static class Pair {

        int timestamp;
        String value;

        Pair(int timestamp, String value) {
            this.timestamp = timestamp;
            this.value = value;
        }
    }
}