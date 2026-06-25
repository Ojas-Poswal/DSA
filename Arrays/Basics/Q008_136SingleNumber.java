//as same number cancel each other, so we can use XOR to find the single number as the only remaining number will be the single number

class Solution {
    public int singleNumber(int[] nums) {
        int ans =0;
        for(int i=0;i<nums.length;i++){
            ans = ans^nums[i];
        }
        return ans;
    }
}