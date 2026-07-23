//basically , hume sorted part mei jaana hai , phir uska min lena and and ans mei store karna, phir uske according high low update karenge , and aise hee sorted part mei jaaate rahenge and ans = Math.min() karke lowest in sorted Ologn mei nikal jaayega 

class Solution {
    public int findMin(int[] nums) {
        int low =0;
        int high = nums.length-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[low]<=nums[mid]){
                ans = Math.min(ans,nums[low]);
                low = mid+1;
            }
            else{
                ans = Math.min(ans,nums[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
}