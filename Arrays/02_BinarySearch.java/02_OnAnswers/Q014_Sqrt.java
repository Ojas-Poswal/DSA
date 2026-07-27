//easy hai high ko n lelo and compare mid*mid agar chhota hai to store and low=mid+1; nhi toh high=mid-1;

class Solution {
    int floorSqrt(int n) {
        
        int ans = 1;
        int low = 0;
        int high = n;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid*mid<=n){
                ans = mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            
            }
        }
        return ans;
    }
}


//part 2 naya yee question hai parr kuch kuch iske jaisa hee hai toh karunga abhi thodi der mei