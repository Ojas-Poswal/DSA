//floor
//Given a sorted array arr[] and an integer x, find the index (0-based) of the largest element in arr[] that is less than or equal to x. This element is called the floor of x. If such an element does not exist, return -1.

// Note: In case of multiple occurrences of floor of x, return the index of the last occurrence.

class Solution {
    static int findFloor(int[] arr, int x) {
        // code here
        int res = -1;
        int low =0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(arr[mid]<=x){
                res = mid;
                low=mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return res;
    }
}


//ceil

class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int res = -1;
        int low = 0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(arr[mid]>=x){
                res=mid;
                high=mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return res;
    }
}