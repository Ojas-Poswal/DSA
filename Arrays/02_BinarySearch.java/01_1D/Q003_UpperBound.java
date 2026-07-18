package Arrays.02_BinarySearch.java.01_1D;

//here index is just greater than ANd NOT equals to 

// Problem	Condition	Move
// Lower Bound	arr[mid] >= x	Save, go left
// Upper Bound	arr[mid] > x	Save, go left
// Floor	arr[mid] <= x	Save, go right
// Ceil	arr[mid] >= x	Save, go left

class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int res = arr.length;
        int low = 0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
             // If arr[mid] >= target, then mid can be the
            // lower bound, so update res to mid and
            // search in left half, i.e. [lo...mid-1]
            if(arr[mid]>target){
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
