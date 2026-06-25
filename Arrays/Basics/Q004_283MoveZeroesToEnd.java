// keep non zero elements in the same order and move all zeros to the end of the array

class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=0;
        while(i<nums.length && j<nums.length){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
                j++;
            }
            else if(nums[j]==0) j++;
        }
        while(i<nums.length){
            nums[i]=0;
            i++;
        }
    }
}
