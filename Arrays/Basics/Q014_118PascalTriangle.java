//toh isme hum ye karenge ki hum ek 2D list banayenge jisme hum rows ke hisab se values store karenge. Har row me hum pehle aur last element ko 1 set karenge, aur beech ke elements ko pichle row ke corresponding elements ka sum karke calculate karenge. Is tarah se hum Pascal's Triangle generate karenge.

class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> arr = new ArrayList<>();
        

        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    int val = arr.get(i-1).get(j-1) + arr.get(i-1).get(j);
                    row.add(val);
                }
            }
            arr.add(row);
        }
        return arr;
    }
}