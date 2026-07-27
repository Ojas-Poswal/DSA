//isme humne binary search lagayi hai basically k par , kyunki koko 0-max tak hee kha paayega uske according min k kya aayega uske liye binary search lagayi hai ,

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high = aMax(piles);
        while(low<=high){
            int mid = low + (high-low)/2;
            long totalHours = hoursNeed(piles,mid);
            if(totalHours<=h) high=mid-1;
            else low=mid+1;

        }
        return low;

    }
    static int aMax(int piles[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            if(max<=piles[i]){
                max=piles[i];
            }
        }
        return max;
    }
    static long hoursNeed(int piles[],int mid){
        long hours=0;
        for(int i=0;i<piles.length;i++){
            hours += (piles[i]+mid-1)/mid;  //ye basically ceil hai jaise 7/3 = 2.33 ie 3 hours ayega toh aise pata chal jayega ki total kitne hours lagenge 
        }
        return hours;
    }
}