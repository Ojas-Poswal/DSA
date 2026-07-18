package Arrays.02_BinarySearch.java.01_1D;

 //Given a sorted array arr[] (following 0-based indexing) and a number target, find the lower bound of the target in this given array. The lower bound of a number is defined as the smallest index in the sorted array where the element is greater than or equal to the given number.
// Note: If all the elements in the given array are smaller than the target, the lower bound will be the length of the array. 

class Solution {
    int lowerBound(int[] arr, int target) {
        int res = arr.length;
        int low = 0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
             // If arr[mid] >= target, then mid can be the
            // lower bound, so update res to mid and
            // search in left half, i.e. [lo...mid-1]
            if(arr[mid]>=target){
                res=mid;
                high=mid-1;
            }
            
             // If arr[mid] < target, then lower bound
            // cannot lie in the range [lo...mid] so
            // search in right half, i.e. [mid+1...hi]
            else{
                low = mid+1;
            }
        }
        return res;
    }
}
