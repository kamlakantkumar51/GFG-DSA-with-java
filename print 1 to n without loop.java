class Solution {

    public void printNos(int n) {
        
        // Input: n = 10
        // Output: 1 2 3 4 5 6 7 8 9 10
        
        // base case 
        if(n== 0)
            return;
        else{
            printNos(n-1);
            System.out.print(n+ " ");
        }
    }
}
