

//first and last occurrence of a target value, toh lower and upper bound se bhi kar sakte and , plain binary search , pehle first occurrence nikalo ek function se , agar nums[mid]==target to move left , jab tak target mile move karo , jaise hee na mile to pichle waala first , and similarly last ke liye right , aise hee ho jayega 

class Solution {
    static int firstOc(int []nums,int target){
        int first = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                first = mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return first;
    }
    static int lastOc(int []nums,int target){
        int last = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                last = mid;
                low=mid+1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
           
        }
        return last;
    }
    public int[] searchRange(int[] nums, int target) {
       int first = firstOc(nums,target);
        if(first==-1) return new int[]{-1,-1};
        return new int[]{first, lastOc(nums,target)};
       
    }
}


// int firstlow =0;
//        int firsthigh = nums.length-1;
//        int firstmid=0;
//        int arr[] = {-1,-1};
//        int index=-1;
//        if(nums.length==0){
//         return arr;
//        }
//        while(firstlow<=firsthigh){
//          firstmid = firstlow+(firsthigh-firstlow)/2;

//          if(nums[firstmid]==target){
//            index = firstmid;
//            firsthigh = firstmid-1;
//          }
//          else if(nums[firstmid]<target){
//             firstlow=firstmid+1;
//          }
//          else if(nums[firstmid]>target){
//             firsthigh = firstmid-1;
//          }
//        }
//        arr[0]=index;
//         firstlow =0;
//         firsthigh = nums.length-1;
//         firstmid=0;
//         index=-1;
//         while(firstlow<=firsthigh){
//          firstmid = firstlow+(firsthigh-firstlow)/2;

//          if(nums[firstmid]==target){
//            index = firstmid;
//            firstlow = firstmid+1;
//          }
//          else if(nums[firstmid]<target){
//             firstlow=firstmid+1;
//          }
//          else if(nums[firstmid]>target){
//             firsthigh = firstmid-1;
//          }
//        }
//        arr[1]=index;
//        return arr;
