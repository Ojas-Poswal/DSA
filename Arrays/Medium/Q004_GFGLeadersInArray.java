package Arrays.Medium;
//toh agar koi bhi element apne right waale elements se bada hai toh woh leader hoga, toh hum last se check karte jaayenge and max ko update karenge taake hume sirf right ka max element check karna pade , aur agar current element max se bada hua toh vo leader hoga , use list mei add karnege and max update kar denge , yahi element naya ma bhi hoga , phir list ko reverse karke return kar denge 
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        int max=Integer.MIN_VALUE;
        
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                list.add(arr[i]);
                max=arr[i];
            }
        }
       Collections.reverse(list);
       
       return list;
        
    }
}
