//find sum of array and find sum of n numbers and return the difference between them

class Solution {
    public int missingNumber(int[] nums) {
       int sum=0;
       int n=nums.length;
       for(int i=0;i<nums.length;i++){
         sum += nums[i];
       }
       int nSum=0;
       nSum = n*(n+1)/2;

       return nSum-sum;
    }
}

//  Arrays.sort(nums);
//         int i;
//         if(nums[0]!=0){
//            return 0;
//         }
//         for( i =0;i<nums.length-1;i++){
//             if(nums[i+1]-nums[i] != 1){
//                 return i+1;
//             }
//         }
//         if(i==nums.length-1){
//             return i+1;
//         }
//         return 0;
