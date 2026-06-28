package Arrays.Medium;

//isme hum hashset mei store karenge and fir har element ke liye check karenge ki element-1 present hai ya nahi, agar nahi hai toh fir usse start karke consecutive elements check karenge aur count karenge, aur max count ko update karenge, aur finally max count return karenge


//### Longest Consecutive Sequence - Why is it O(n)?
// Even though there is a `while` loop inside a `for` loop, the overall time complexity is **O(n)**.
// **Reason:**
// * We only start counting from numbers that **don't have a predecessor** (`num - 1` is absent).
// * This ensures every consecutive sequence is counted **exactly once**.
// * During the `while` loop, each element is visited at most **one time** across the entire algorithm.
// Example:
// ```
// 1 2 3 4 5
// Start only from 1:
// 1 → 2 → 3 → 4 → 5
// 2, 3, 4, 5 are skipped because they already have a predecessor.
// ```
// Total work:
// * HashSet insertion: **O(n)**
// * Outer loop: **O(n)**
// * All `while` loop iterations combined: **O(n)** (not O(n) for every element)
// Therefore,
// *Overall Time Complexity = O(n)**
// **Key Interview Point:**
// Nested loops are **not always O(n²)**. If the inner loop visits each element only once across the entire execution (amortized analysis), the total complexity remains **O(n)**.


class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxCount=0;
        for(int num: set){
            if(!set.contains(num-1)){
                int currentNum = num;
                int length = 1;
                while(set.contains(currentNum+1)){
                    length++;
                    currentNum++;
                }
                maxCount = Math.max(maxCount,length);
               
            }
        }
        return maxCount;
    }
}

//ye nlogn hai isme sort kar liya and and simply longest sequence count kar lenge
// if(nums.length==0){
//             return 0;
//         }
//         Arrays.sort(nums);
//         int count=0;
//         int j= count;
//         for(int i=0;i<nums.length-1;i++){
            
//             if(nums[i+1]==nums[i]+1){
//                 count++;
//             }
            
//             else if(nums[i+1]>nums[i]+1){
//                 count=0;
//             }
//             else{
//                 continue;
//             }
            
//             if(j<count){
//                 j=count;
//             }
//         }
//         return j+1;




