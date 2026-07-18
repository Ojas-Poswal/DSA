package Arrays.UsingMergeSort;
 
//Given an array of integers arr[]. You have to find the Inversion Count of the array. Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].

class Solution {

int count = 0;

void merge(int []arr,int low,int mid,int high){
    int[] temp = new int[high - low + 1];

    int i = low;
    int j = mid + 1;
    int k = 0;

    while (i <= mid && j <= high) {
        if (arr[i] <= arr[j]) {
            temp[k++] = arr[i++];
        } else {
            temp[k++] = arr[j++];
            count += (mid - i + 1);   // inversion count
        }
    }

    while (i <= mid) {
        temp[k++] = arr[i++];
    }

    while (j <= high) {
        temp[k++] = arr[j++];
    }

    for (int x = 0; x < temp.length; x++) {
        arr[low + x] = temp[x];
    }
}

void mergeSort(int arr[],int low,int high){
    if(low>=high) return;
    
    int mid = low + (high-low)/2;
    
    mergeSort(arr,low,mid);
    mergeSort(arr,mid+1,high);
    
    merge(arr,low,mid,high);
}


    public int inversionCount(int arr[]) {
        // code here
        mergeSort(arr,0,arr.length-1);
        return count;
    }
}