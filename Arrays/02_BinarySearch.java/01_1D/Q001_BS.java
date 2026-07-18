package Arrays.02_BinarySearch.java.01_1D;

class Solution {
    public int search(int[] nums, int target) {
       int low =0;
       int high = nums.length-1;
       int mid;
       while(low<=high){
        mid = low + (high-low)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(target<nums[mid]){
            high = mid-1;
        }
        else if(target>nums[mid]){
            low = mid+1;
        }
       }
       return -1;
    }
}
