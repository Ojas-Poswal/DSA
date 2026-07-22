//first and last oc ki tarah hee hai , bass last - first +1 hee karna hai baaki ho jaayega

class Solution {
    static int firstOc(int []nums,int target){
        int first = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                first = mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return first;
    }
    static int lastOc(int []nums,int target){
        int last = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                last = mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
           
        }
        return last;
    }
    int countFreq(int[] arr, int target) {
        
        int first = firstOc(arr,target);
        if (first==-1) return 0;
        return lastOc(arr,target)-first+1;
    }
}