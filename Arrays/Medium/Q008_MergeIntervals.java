package Arrays.Medium;

//intervals sort karo current se next waale ka 0th index check karo agar ussi mei aara toh add kardo , varna uss interval ko list mei add karo and naye waale interval ko curr bana do , simple

class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();
        int n = intervals.length;
        int curr[] = intervals[0];

        for(int i=1;i<n;i++){
            if(curr[1] >= intervals[i][0]){
                curr[1] = Math.max(curr[1],intervals[i][1]);
            }
            else{
                ans.add(curr);
                curr = intervals[i];
            }
        }
        ans.add(curr);
        return ans.toArray(new int[ans.size()][]);

    }
}
