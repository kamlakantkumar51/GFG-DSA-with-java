class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // Input: a = 5 , b = 10
        // Output: [10, 5]
        int hcf = gcd(a, b);
        int lcm = (a * b) / hcf;
        return new int[]{lcm, hcf};
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
