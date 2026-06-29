package Arrays.PrefixSum;

//toh ye hum aise solve karenge ki hum prefix sum ka use karenge aur hashmap me store karenge prefix sum aur uski frequency. Toh hum prefix sum calculate karenge aur check karenge ki prefixSum-k exist karta hai ya nahi hashmap me. Agar karta hai toh iska matlab hai ki ek subarray exist karta hai jiska sum k ke barabar hai. Toh hum uski frequency ko count me add kar denge. Fir hum hashmap me prefix sum ko update kar denge.
//lekin hum prefixSum-k ko kyu check kar rahe hai? kyunki agar prefixSum-k exist karta hai toh iska matlab hai ki ek subarray exist karta hai jiska sum k ke barabar hai. Toh hum uski frequency ko count me add kar denge. Fir hum hashmap me prefix sum ko update kar denge.
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixSum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            prefixSum += nums[i];
            if(map.containsKey(prefixSum-k)){
                count = count + map.get(prefixSum-k);//return frequency how many times prefixSum-k appeared 
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1); //everytime we get prefixSum-k this will increase it's frequency
        }
        return count;

    }
}

// HashMap<Integer,Integer> hs = new HashMap<>();
//         hs.put(0,1);
//         int sum =0;
//         int count =0;
//         for(int num:nums){
//             sum = sum+num;
//             if(hs.containsKey(sum-k)){
//                 count =count+ hs.get(sum-k);
//             }
//             hs.put(sum,hs.getOrDefault(sum,0)+1);
//         }
//         return count;



//sliding window won't work
// int left=0;
//         int sum=0;
//         int count=0;
//         for(int right=0;right<nums.length;right++){
//             sum += nums[right];
//             if(sum>=k){
//                 if(sum==k) count++;
//                 while(sum>k){
                  
//                   sum = sum - nums[left];
//                   left++;
                  
//                 }
//             }  
//         }
//         return count;
