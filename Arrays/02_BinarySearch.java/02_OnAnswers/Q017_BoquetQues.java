//so isme kitne days par bloom karega jaise 7-13 in given example toh hum uspe binary search lagayenge , and isme ek possible ka function lagana padega jisme pata lagega ki actually possible hai bhi ki nahi boquet banana

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        if(n< (long)m*k) return -1; //one and only edge case 
        int low = min(bloomDay);
        int high = max(bloomDay);
        while(low<=high){
            int mid = low + (high-low)/2;
            if(possible(bloomDay,mid,m,k)){
                high=mid-1; //agar possible hai toh minimum days chahiye isliye ye
            }
            else{
              low=mid+1;
            }
        }
        return low;
    }
    static int min(int days[]){
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<days.length;i++){
            if(mini>days[i]){
                mini = days[i];
            }
           
        }
         return mini;
    }
    static int max(int days[]){
         int maxi=Integer.MIN_VALUE;
        for(int i=0;i<days.length;i++){
            if(maxi<days[i]){
                maxi = days[i];
            }
           
        }
         return maxi;
    }
    static boolean possible(int days[],int day,int m,int k){
        int count = 0;
        int bqt = 0;
        for(int i=0;i<days.length;i++){
            if(days[i]<=day) count++;
            else{
                bqt += count/k; 
                count=0;
            }
        }
        bqt += count/k;
        
        return bqt>=m;
    }
}