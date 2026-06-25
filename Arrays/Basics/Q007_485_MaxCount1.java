//count every 1 and reset the count when we encounter 0. Keep track of the maximum count of consecutive 1s found so far using maxCount variable. Finally, return the maxCount as the result.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            maxCount = Math.max(maxCount,count);
        }
        return maxCount;
    }
}
