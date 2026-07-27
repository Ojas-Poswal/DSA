//so hum yaha mid , n , m teeno ko pass karenge , and long use karenge for integer overflow, agar product =m toh jaha mid aaya vaha return kar denge 
//1 product=mid
//0 high = mid-1 , kyunki phir vo mid humare given nth rooth of m se bohot zyada bada hai
//2 low =  mid+1 kyunki usse chhota hai , but we look for max;

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        if(m==0) return 0;
        int low = 1;
        int high = m;
        while(low<=high){
            int mid = low + (high-low)/2;
            int nRoot = mul(mid,n,m);
            if(nRoot==1) return mid;
            else if(nRoot==2) low=mid+1;
            else high = mid-1;
        }
        return -1;
    }
    static int mul(int mid,int n,int m){
        long product=1;
        for(int i=1;i<=n;i++){
            product *= mid;
            if(product>m) return 0;
        }
        if(product==m) return 1;
        return 2;
    }
}


//this has a problem in it the integer value will overflow, thats why we use different approach in mul function nthRoot is correct

// class Solution {
//     public int nthRoot(int n, int m) {
//         // code here
//         int low = 1;
//         int high = m;
//         while(low<=high){
//             int mid = low + (high-low)/2;
//             if(mul(mid,n)==m) return mid;
//             else if(mul(mid,n)<m) low=mid+1;
//             else high = mid-1;
//         }
//         return -1;
//     }
//     static int mul(int mid,int n){
//         int product=1;
//         for(int i=1;i<=n;i++){
//             product *= mid;
//         }
//         return product;
//     }
// }