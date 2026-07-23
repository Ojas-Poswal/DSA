//same as smallest element , just it's index is the answer

class Solution {
    public int findKRotation(int arr[]) {
        int low=0;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        int index = 0;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    ans = arr[low];
                    index=low;
                } 
                
                low = mid+1;
            }
            else{
                if(arr[mid]<ans){
                    ans = arr[mid];
                    index=mid;
                }
                
                high = mid-1;
            }
        }
        
        return index;
    }
}