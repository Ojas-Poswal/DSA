// keep adding sum until negative arrives 
// if sum is greater than max or if sum is equal to max and length is greater than max length then update max sum and max length and also update start and end index of the subarray

// if not that means a zero is encountered because first check is for positive so we will reset curr sum and curr length and also update start index to i+1

// if ansStart=-1 then add it to list and return , if not then add the elements from ansStart to ansEnd to the list and return it

class Solution {
    public ArrayList<Integer> findSubarray(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int currSum=0;
        int currLen=0;
        
        int maxSum=0;
        int maxLen=0;
        int start=0;
        int ansStart=-1;
        int ansEnd =-1 ;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                currSum+=arr[i];
                currLen++;
                
                if(currSum>maxSum || (currSum==maxSum && currLen>maxLen)){
                    maxSum = currSum;
                    maxLen=currLen;
                    ansStart = start;
                    ansEnd=i;
                }
            }
            else{
                currSum=0;
                currLen=0;
                start=i+1;
            }
        }
        if(ansStart==-1){
            list.add(-1);
            return list;
        }
        for(int i=ansStart;i<=ansEnd;i++){
            list.add(arr[i]);
        }
        return list;
    }
}