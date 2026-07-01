package Arrays.Boyre_Moore_Majority_Vote;
//toh ye ques bhi kuch kuch majority element ki tarah hi hai , isme hum 2 candidates hee rakh sakte kyunki >n/3 chahiye and (n/3)*3 = n , toh 2 hi candidates ho sakte hai , toh aise hum 4 variables rakh lenge 

// If the current number matches a candidate, increase its count; otherwise, if a count is 0, replace that candidate with the current number.
// If the number matches neither candidate and both counts are non-zero, decrement both counts (this cancels out different elements).
// After the first pass, the candidates are only possible majority elements, not guaranteed ones.
// Do a second pass to count their actual frequencies and add them to the answer if they occur more than n/3 times

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count1=0;
        int count2=0;
        int cand1=0;
        int cand2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==cand1){
                count1++;
            }
            else if(nums[i] ==cand2){
                count2++;
            }
            else if(count1==0){
                cand1=nums[i];
                count1=1;
            }
            else if(count2==0){
                cand2=nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(cand1==nums[i]) count1++;
            else if(cand2==nums[i]) count2++;
        }
        if(count1>nums.length/3) list.add(cand1);
        if(count2>nums.length/3) list.add(cand2);

        return list;
    }
}
