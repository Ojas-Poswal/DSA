class Solution {
    int maxLength(int arr[]) {
        
        int prefixSum=0;
        int maxCount=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        
        for(int i=0;i<arr.length;i++){
            prefixSum += arr[i];
            if(map.containsKey(prefixSum)){
                maxCount = Math.max(maxCount , i-map.get(prefixSum));
            }
            else{
               map.put(prefixSum,i); 
            }
            
        }
        return maxCount;
    }
}
