package Arrays.Medium;

class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        
        //eqtn 1
        long sum=0;
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        long nSum = (long)n*(n+1)/2; //sum of n natural numbers
        
        long eqtn1 = sum-nSum; // x - y x = repeating y = missing 
        
        
        //eqtn 2
        long squareSum=0;
        for(int i =0;i<n;i++){
            squareSum += (long)arr[i]*arr[i];
        }
        long nSquareSum = (long)n*(n+1)*(2*(long)n +1 )/6; // sum of square of n 
         
        long eqtn2 = squareSum - nSquareSum; // x^2 - y^2 
        
        eqtn2 = eqtn2/eqtn1; // x+y = ans/(x-y)
        
        list.add((int)((eqtn1+eqtn2)/2)); //solved for x
        list.add((int)(eqtn2-list.get(0))); //solved for y and there we go 
        
        return list;
        
    }
}