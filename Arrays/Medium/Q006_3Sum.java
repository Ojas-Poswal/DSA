package Arrays.Medium;

//so ye bhi kaafi simple hai , hum 3 elements ka sum 0 karna hai -> toh 1 element fix kar lenge say 4 toh 4 + x + y = 0 -> x+y = -4 , toh hum 2 pointer approach use karenge , left and right pointer , left se start karenge aur right se end se start karenge 
//sabse pehle sort karenge -> phir i=0 se n-2 tak loop chalayenge , aur left = i+1 and right = n-1 set karenge , aur jab tak left<right hai tab tak loop chalayenge , sum = nums[i]+nums[left]+nums[right] , agar sum==0 hai toh list me add karenge and left++ and right-- kar denge , agar sum<0 hai toh left++ karenge , else right-- karenge 
//lekin humne n-2 isiliye liya kyunki last 2 elements ke liye left and right pointer kaam karenge , aur humne i>0 && nums[i]==nums[i-1] continue isiliye kiya kyunki agar same element hai toh usko skip kar denge , aur left<right && nums[left]==nums[left+1] left++ and right<left && nums[right]==nums[right-1] right-- isiliye kiya kyunki same element ko skip kar denge


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> list = new ArrayList<>();
       Arrays.sort(nums);
       int n = nums.length;
       for(int i=0;i<n-2;i++){
         if(i>0 && nums[i]==nums[i-1]) continue;
         int left = i+1;
         int right = n-1;
         while(left<right){
            int sum = nums[i]+nums[left]+nums[right];
            if(sum==0){
                list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                while(left<right && nums[left]==nums[left+1]) left++;
                while(left<right && nums[right]==nums[right-1]) right--;

                left++;
                right--;

            }
            else if(sum<0){
                left++;
            }
            else{
                right--;
            }
        }
       }
         
       
       return list;
    }
}
