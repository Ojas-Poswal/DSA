package Arrays.Medium;

//so ye 3 sum se kaafi similar hai , bass 2 elements fix karenge and baki 2 elements ke liye 2 pointer approach use karenge , aur target sum ka dhyan rakhenge , aur integer overflow ka bhi dhyan rakhenge , toh long me convert kar denge
//usme 0 tha isme remaining sum hai

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            for(int j = i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                int left = j+1;
                int right = n-1;
                
                long remainingSum = (long)target - nums[i]-nums[j];
                while(left<right){
                    long sum = (long)nums[left]+nums[right]; //be careful of integer overflow and always check input range
                    if(sum==remainingSum){
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(left<right && nums[left]==nums[left+1]) left++;
                        while(left<right && nums[right]==nums[right-1]) right--;

                        left++;
                        right--;
                    }
                    else if(sum<remainingSum){
                        
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return list;
    }
}
