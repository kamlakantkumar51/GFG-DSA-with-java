class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Input: arr[] = [3, 2, 1, 56, 10000, 167]
        // Output: 1 10000
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        //ITERATION
        for(int i = 0; i<arr.length;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        return new Pair(min,max);
        
    }
}
