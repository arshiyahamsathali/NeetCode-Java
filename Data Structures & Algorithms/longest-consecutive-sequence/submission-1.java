
class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> set = new HashSet<>();
       for(int num:nums){
            set.add(num);
       }
       int maxLen=0;
       for(int num:set){
            if(!set.contains(num-1)){
                int cur=num;
                int len=1;
                while(set.contains(cur+1)){
                    cur++;
                    len++;
                }
            maxLen = Math.max(maxLen, len);
            }
       }
        return maxLen;
    }
}