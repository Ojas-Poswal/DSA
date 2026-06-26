package Arrays.Medium;

class Solution {
    public int maxProfit(int[] prices) {
      int minPrice = Integer.MAX_VALUE;
      int maxProfit = 0;
      for(int price : prices){
        minPrice = Math.min(minPrice,price);
        int currMax = price-minPrice;
        maxProfit = Math.max(maxProfit,currMax);
      }
      return maxProfit;
    }
}