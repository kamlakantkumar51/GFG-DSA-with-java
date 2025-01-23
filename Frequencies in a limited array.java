class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        // Input: arr[] = [2, 3, 2, 3, 5]
        // Output: [0, 2, 2, 0, 1]
        
        int n = arr.length;
        int hash[] = new int[n+1];
        for(int num:arr){
            hash[num]++;
        }
        
        List<Integer> ans = new LinkedList<>();
        for(int i = 1; i<n+1; i++){
            ans.add(hash[i]);
        }
        
        return ans;
        
    }
}
