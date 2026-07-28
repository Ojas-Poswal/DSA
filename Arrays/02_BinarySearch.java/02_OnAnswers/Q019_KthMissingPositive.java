// so inn this case for optimal solution , suppose [2,3,4,7,11] and 5th missing number , so instead of 2,3,4,7,11, we should had 1,2,3,4,5 if you subtract u get 1,1,2,3,6 that is the number of missing no. before that number , so before 7 we have 3 missing number , now 7 + remaining missing = final answer , that is 9;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
       int low =0;
       int high=n-1;
       // For index i, missing = arr[i] - (i+1) tells us how many positive
        // integers are missing from 1..arr[i] (since if none were missing,
        // arr[i] would just equal i+1).
        // We binary search for the largest index where missing < k,
        // i.e., the last point where we still haven't "used up" k missing numbers
       while(low<=high){
        int mid = low + (high-low)/2;
        int missing = arr[mid]-(mid+1);
        if(missing<k) low = mid+1; // not enough missing numbers yet, search right
        else high=mid-1; // too many (or exactly k), search left
       }
        // After the loop, 'high' is the last index where missing < k.
        // arr[high] already accounts for 'missing' missing numbers before it,
        // so the kth missing number is (high+1) + (k - missing) 
        // which simplifies to high + k + 1.
       return high+k+1;
    }
}