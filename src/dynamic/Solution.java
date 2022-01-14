package dynamic;

public class Solution {

    public int fib(int n) { //50就扛不住了
        if (n == 0) return 0;
        else if (n== 1) return 1;
        else return Math.floorMod(fib(n-1)+fib(n-2), 1000000007);
    }

    public int fibV2(int n) {
        int[] dp = new int[n +  2];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.floorMod(dp[i - 1], 1000000007) +Math.floorMod(dp[i - 2], 1000000007) ;
        }
        return Math.floorMod(dp[n], 1000000007);
    }

    public int fibV3(int n) {
        int a=0, b=1, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = (a+b)%1000000007;
            b=a;
            a=sum;
        }
        return a;
    }

    public int numWaysGF(int n) {
        int a = 1, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
