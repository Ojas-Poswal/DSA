
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = max(nums);
        
        while(low<=high){
            int mid = low + (high-low)/2;
            int thresh = threshHold(nums,mid);
            
             if(thresh<=threshold) high = mid-1;
            else low=mid+1;

        }
        return low;
    }
    static int max(int days[]){
         int maxi=Integer.MIN_VALUE;
        for(int i=0;i<days.length;i++){
            if(maxi<days[i]){
                maxi = days[i];
            }
           
        }
         return maxi;
    }
    static int threshHold(int nums[], int div){
        int ceil=0;
        for(int i=0;i<nums.length;i++){
            ceil += (nums[i]+div-1)/div;
        }
        return ceil;
    }
}