class Solution {
    public int reverseBits(int n) {
      int result = 0;
        for (int i = 0; i < 32; i++) { // assuming 32-bit integer
            result <<= 1;          // shift result left
            result |= (n & 1);     // add the last bit of n
            n >>= 1;               // shift n right
        }
        return result;  
        
    }
}