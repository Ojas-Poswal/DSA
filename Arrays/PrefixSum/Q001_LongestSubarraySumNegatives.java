package Arrays.PrefixSum;
//explanation - here we take the sum of the array and store it in a hashmap with the index of the sum. If we find a sum that is equal to k, we update the maxLength. If we find a sum that is equal to sum-k, we update the maxLength with the difference of the current index and the index of the sum-k. Finally, we return the maxLength.  but I still have doubt in it 
class Solution {
    public int LongestSubarraySumNegatives(int[] nums,int k) {
        int n = nums.length;
        int maxLength = 0;
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
          sum += nums[i];
          if(sum == k) {
            maxLength = Math.max(maxLength, i + 1);
          }
         
        if(map.containsKey(sum-k)){
                maxLength = Math.max(maxLength, i- map.get(sum-k));
        }
        if(!map.containsKey(sum))
            map.put(sum,i);
            
          
        }
        return maxLength;
    }
}
