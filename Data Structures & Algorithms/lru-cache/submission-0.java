class LRUCache {

    private int capacity;
    private LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        cache = new LinkedHashMap<>(capacity, 0.75f, true);
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        return cache.get(key);
    }

    public void put(int key, int value) {
        cache.put(key, value);

        if (cache.size() > capacity) {
            int lruKey = cache.keySet().iterator().next();
            cache.remove(lruKey);
        }
    }
}