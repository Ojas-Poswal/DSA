//agar hashmap mei complement hai toh vapas kar do complement ka index  and index i , agar nahi hai toh vo number yaani nums[i] add uska index store karo as key and value pair in hashMap

//ya phir saare index and value store karo in hashmap and then complement nikaal ke search karo agar hai to return karo nahi hai toh empty return karo 

class Solution {
    public int[] twoSum(int[] nums, int target) {
      //using hashtable
      HashMap<Integer,Integer> map = new HashMap<>();
      int n = nums.length;

      for(int i=0;i<n;i++){
        int complement = target-nums[i];
        if(map.containsKey(complement)){
            return new int[]{map.get(complement),i};
        }
        map.put(nums[i],i);
      }
      return new int[]{};

    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//       int n = nums.length;

//         for (int i = 0; i < n-1; i++){
//             for (int j = i+1 ; j < n; j++){
//                 if (nums[j] + nums[i] == target) return new int[]{i, j};
//             }
//         }
        
//         return new int[]{0, 0};

//     }
//}