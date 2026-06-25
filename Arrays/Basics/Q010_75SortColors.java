//isme sorting kar sakte hai par vo nlogn hogi iss method se bass n hee hogi , kyunki hum 0,1,2 count kar rahe 

class Solution {
    
    public void sortColors(int[] nums) {
       int count0=0;
       int count1=0;
       int count2=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==0){
            count0++;
        }
        else if(nums[i]==1){
            count1++;
        }
        else if(nums[i]==2){
            count2++;
        }
       }
       int i=0;
       while(i<count0){
         nums[i]=0;
         i++;
       }
       while(i<count0+count1){
         nums[i]=1;
         i++;
       }
       while(i<count0+count1+count2){
        nums[i]=2;
        i++;
       }
    }
}
