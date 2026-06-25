class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;
        int count =1;
        while(i<nums.length && j<nums.length){
            if(nums[i]==nums[j]) j++;
            else if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
                j++;
                count++;
            }
        }
        return count;
    }
}