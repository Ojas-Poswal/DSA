//so here hum spiral order me matrix ke elements ko traverse karenge aur unhe ek list me store karenge. Hum 4 pointers ka use karenge: top, bottom, left, right. Ye pointers matrix ke boundaries ko represent karte hain. toh hum top row travaerse karenge left se right tak, fir right column traverse karenge top se bottom tak, fir bottom row traverse karenge right se left tak, aur fir left column traverse karenge bottom se top tak. Har traversal ke baad hum respective pointer ko update karenge. Ye process tab tak chalega jab tak top pointer bottom pointer se chhota ya barabar hai aur left pointer right pointer se chhota ya barabar hai.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> list = new ArrayList<>();
       int left = 0;
       int right = matrix[0].length-1;
       int top = 0;
       int bottom = matrix.length-1;
       while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            list.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=bottom;i++){
            list.add(matrix[i][right]);
        }
        right--;
        if(top<=bottom){
            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
        }
        if(left<=right){
            for(int i=bottom;i>=top;i--){
                list.add(matrix[i][left]);    
            }
            left++;
        }
       }
       return list;
    }
}


// List<Integer> result = new ArrayList<>();
//         int rows=matrix.length;
//         int cols=matrix[0].length;
//         int top=0;
//         int bottom=rows-1;
//         int left=0;
//         int right=cols-1;
//             while (top <= bottom && left <= right){
//             for(int j=left;j<=right;j++){
//                 result.add(matrix[top][j]);
//             }
//             top++;
//             for(int i=top;i<=bottom;i++){
//                 result.add(matrix[i][right]);
//             }
//             right--;
//             if (top<=bottom) {
//                 for(int j=right;j>=left;j--){
//                     result.add(matrix[bottom][j]);
//                 }
//                 bottom--;
//             }
//             if(left<=right) {
//                 for (int i=bottom;i>=top;i--) {
//                     result.add(matrix[i][left]);
//                 }
//                 left++;
//             }
//         }

//         return result;