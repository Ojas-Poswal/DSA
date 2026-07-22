//Har iteration me pehle check karte hain ki left half sorted hai ya right half. Jo half sorted hota hai, usme dekhte hain ki target uski range ke andar aata hai ya nahi. Agar aata hai to usi half me search continue karte hain, warna dusre half me chale jaate hain. Is tarah har step me search space aadha ho jata hai, isliye Time Complexity = O(log n).

class Solution {
    public int search(int[] nums, int target) {
       int low =0;
       int high = nums.length-1;
         while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target) return mid;
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<nums[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                if(nums[mid]<= target && target <= nums[high]){
                    low = mid+1;
                }
                else{
                    high=mid-1;
                }
            }
         
       }
       return -1;
    }
}
