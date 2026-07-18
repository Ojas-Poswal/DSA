package Arrays.02_BinarySearch.java.01_1D;

//this one is lower bound
class Solution {
    public int searchInsert(int[] nums, int target) {
       int low = 0;
       int high = nums.length-1;
       int res = nums.length;

       while(low<=high){
        int mid = low + (high-low)/2;
        if(nums[mid] >= target){
            res = mid;
            high=mid-1;
        }
        else{
            low = mid+1;
        }
       }
       return res;
    }
}