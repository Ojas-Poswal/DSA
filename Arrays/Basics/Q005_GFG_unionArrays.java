// add elements of both arrays to a set and return the set as an arraylist use TreeSet to keep the elements in sorted order and avoid duplicates


class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        
        
        
        return new ArrayList<>(set);
        
    }
}
