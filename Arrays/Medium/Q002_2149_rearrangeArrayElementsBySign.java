package Arrays.Medium;

//make two pointer +ve -ve and increment by 2 ofcourse , store ans in another array;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []ans = new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos += 2;
            }
            else if(nums[i]<0){
                ans[neg] = nums[i];
                neg += 2;
            }
        }

        return ans;
       
    }
}

//this one's good cause you store +ve in one array -ve in another and join them one be one and return ;
//  int n=0;
//         int p=0;
//         int []neg = new int[nums.length/2];
//         int []pos = new int[nums.length/2];
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]>=0){
//               pos[p]=nums[i];
//               p++;
//             }
//             else{
//                 neg[n]=nums[i];
//                 n++;
//             }
//         }
//         p=0;
//         n=0;
//         for(int i=0;i<nums.length;i++){
//             if(i%2==0){
//                 nums[i]=pos[p];
//                 p++;
//             }
//             else{
//                 nums[i]=neg[n];
//                 n++;
//             }
//         }
//         return nums;





//this one's a fokin mess, i tried swapping withing same array buy didn't work out quite well
// int j=0;
//        int i=1;
//        while(i<nums.length && j<nums.length){
//         if(j%2==0){
//             if(nums[j]>=0){
//                 j++;
//                 i++;
//             }
//             else{
//                 i++;
//                 if(nums[i]>=0){
//                     int temp = nums[i];
//                     nums[i] = nums[j];
//                     nums[j]=temp;
//                     j++;
//                 }
//             }
//         }
//         else {
//              if(nums[j]<0){
//                 j++;
//                 i++;
//             }
//             else{
//                 i++;
//                 if(nums[i]<0){
//                     int temp = nums[i];
//                     nums[i] = nums[j];
//                     nums[j]=temp;
//                     j++;
//                 }
//             }

//         }
//        }
//        return nums;
