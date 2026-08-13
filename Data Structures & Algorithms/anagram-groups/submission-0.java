class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            // Step 1: Sort the characters of the word
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            // Step 2: Put into map
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        // Step 3: Return all grouped lists
        return new ArrayList<>(map.values());
    }
}
