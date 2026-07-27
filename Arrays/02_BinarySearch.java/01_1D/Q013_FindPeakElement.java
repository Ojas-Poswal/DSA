//isme basically mid element mid-1 and mid+1 se bada hai to peak hai , agar 0th bada hai toh wo return kar denge agar n-1th  bada hai toh vo return kar denge , and low rakhenge 1 , high rakhenge n-2 for handling edge cases , and ye multiple peaks ke liye bhi kaam karega , refer notebook for further explanation.

class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;

        int low = 1;
        int high = n-2;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid]<nums[mid-1]){
                high=mid-1;
            } 
            else{
                low = mid+1;

            }
        }
        return -1;
    }
}
