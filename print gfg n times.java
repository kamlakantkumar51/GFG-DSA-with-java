class Solution {

    void printGfg(int N) {
        // code here
        // Input:5
        // Output:GFG GFG GFG GFG GFG
        if(N==0){
            return;
        }
        
        System.out.print("GFG ");
        printGfg(N-1);
    }
}
