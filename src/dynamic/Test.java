package dynamic;

public class Test {

    public void fibTest() {
        Solution solution = new Solution();
        for (int i = 0; i <= 48; i++) {
            int res = solution.fibV3(i);
            System.out.println(res);
        }
    }

    public void numWaysTest() {
        Solution solution = new Solution();
        for (int i = 0; i <= 7; i++) {
            int res = solution.numWaysGF(i);
            System.out.println(res);
        }
    }

    public void maxProfitTest() {
        Solution solution = new Solution();
        int[] prices = {7,6,4,3,1};
        int maxProfit = solution.maxProfit(prices);
        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        Test test = new Test();
//        test.fibTest();
//        test.numWaysTest();
        test.maxProfitTest();
    }
}
