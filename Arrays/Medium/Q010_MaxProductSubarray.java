package Arrays.Medium;

class Solution {
    public int maxProduct(int[] nums) {
        int suff=1;
        int pre=1;
        int max=nums[0];
        int n=nums.length;
        
        for(int i=0;i<nums.length;i++){
            if(suff==0) suff=1;
            if(pre==0) pre=1;

            pre *= nums[i];
            suff *= nums[n-i-1];

            max = Math.max(max,Math.max(pre,suff));
        }
        return max;
    }
}
