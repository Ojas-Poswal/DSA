package Arrays.Boyre_Moore_Majority_Vote;

// iss solution mei hum recursively dekh rahe , agar koi element ki count negative ho jaye toh vo n/2 baar nhi dikh paayega , toh phir hum ,next index ki taraf chal denge , agar no. mil gaya yoh use return kar denge
class Solution {
    public int majorityElement(int[] nums) {
        return helper(nums,0,nums[0]);
    }
    static int helper(int[] nums,int start,int element){
        int count=0;
        for(int i=start;i<nums.length;i++){
            if(element == nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==-1){
                return helper(nums,i,nums[i]);
            }
        }
        return element;
    }
   
}


//isme simple hai , pehle sort kar do and then uske baad , majority element hai toh halfway yaani , index n/2 par mil jaayega 
// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[nums.length/2];
        
//     }
// }