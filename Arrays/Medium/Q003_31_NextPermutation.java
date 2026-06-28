package Arrays.Medium;
//bhaisaabh isme kaafi mushkil tha parr, kuch aisa samaj aaya hai , dekho kaisa, tum last se check karte aao ki kya i+1 wala bada hai ya chota, jab tak bada hai tab tak i-- karte jao, aur jab chota mil jaaye toh usko swap kar do aur uske baad i+1 se leke last tak reverse kar do, kyunki last tak bada hoga hi na, aur reverse karne se smallest permutation mil jaayega , and j  ka use isiliye kiya hai taaki ith elemnt se just bada element dhunde and uuse swap kar de , ye sabh khud try kiya hai copy mei hai 
class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n-2; // ye isiliye liya kyunki n-1 lete toh i+1 out of bound ho jaata 
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    } 
    static void swap(int []nums , int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    } 
    static void reverse(int []nums, int i, int j){
       while(i<j){
        swap(nums,i++,j--);
       }
    }  
}


// int n=nums.length;
//        int i=n-2;
//        while(i>=0 && nums[i]>=nums[i+1]){
//         i--;
//        }
//        if(i>=0){
//         int j=n-1;
//         while(nums[j]<=nums[i]){
//             j--;
//         }
//         swap(nums,i,j);
//        }
//        reverse(nums,i+1,n-1);
//     }
//     void swap(int []arr,int i,int j){
//         int temp = arr[i];
//         arr[i]=arr[j];
//         arr[j]=temp;
//     }
//     void reverse(int []arr,int i,int j){
//         while(i<j){
//             swap(arr,i++,j--);
//         }
//     }
