//toh ye bhi simple hai 1.pehle sort kar lenge , phir 0th pe pehli cow rakhenge and jo humara min dist hai and next consecutive bada ya barabar hai to vaha cow 2 place karenge and so on , and mid hoga vo minimum distance , min distance hoga 0 - (max-min of array) aise min dist return ho jaayega

class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int low=0;
        int high = arr[arr.length-1]-arr[0];
        while(low<=high){
            int mid = low + (high-low)/2;
            if(canWePlace(arr,mid,k)) low=mid+1;
            else high = mid-1;
        }
        return high;
    }
    static boolean canWePlace(int arr[],int minDist,int cows){
        int cowCount=1;
        int last=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-last>=minDist){
                cowCount++;
                last = arr[i];
            }
        }
        if(cowCount>=cows) return true;
        return false;
    }
}