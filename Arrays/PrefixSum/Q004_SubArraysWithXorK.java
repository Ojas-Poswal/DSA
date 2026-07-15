class Solution {
    public long subarrayXor(int arr[], int k) {
        int prefixXor = 0;
        long count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        for(int i=0;i<arr.length;i++){
            prefixXor = prefixXor ^ arr[i];
            if(map.containsKey(prefixXor^k)){
                count += map.get(prefixXor^k);
            }
            map.put(prefixXor,map.getOrDefault(prefixXor,0)+1);
        }
        
        return count;
    }
}