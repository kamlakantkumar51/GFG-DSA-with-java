class Solution {
    int sumOfSeries(int n) {
        // INPUT:N=5
        // OUTPUT:=225
        
        //base case
        if(n<=1)
            return n;
        //recursive case 
        return (n*n*n) + sumOfSeries(n-1);
    }
}
