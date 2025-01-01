
class Solution {
    static int evenlyDivides(int n) {
        // Input: n = 12
        // Output: 2
        int count=0;
        int number=n;
        while(n>0){
            int digit = n%10;//digits bahar nikaalte hue
            n/=10;//last digits ko remove krte hue
            if(digit!=0 && number%digit==0){
                count++;
            }
        }
        return count;
    }
}
