//keep adding elements to the sum until it is less than or equal to k, if it exceeds k then remove elements from the left until the sum is less than or equal to k, if the sum is equal to k then update the max length of the subarray

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen;
    }
}
