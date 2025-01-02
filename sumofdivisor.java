class Solution {
    public static int sumOfDivisors(int n) {
        // Input: n = 4
        // Output: 15
        
        int sum =0;
        for(int i=1;i<=n;i++){
            sum+= i*(n/i);
        }
        return sum;
    }
}
