public class Test {

//    public static void main(String[] args) {
//        StringSolution stringSolution = new StringSolution();
//        String s = "We are happy.";
//        String s1 = stringSolution.replaceSpace(s);
//        System.out.println(s1);
//    }

//    public static void main(String[] args) {
//        StringSolution stringSolution = new StringSolution();
//        String s = "kr";
//        String s1 = stringSolution.reverseLeftWords(s, 1);
//        System.out.println(s1);
//    }

//    public static void main(String[] args) {
//        int[] nums = {2, 3, 1, 0, 2, 5, 3};
//
//
//        SearchSolution searchSolution = new SearchSolution();
//        int repeatNumber = searchSolution.findRepeatNumber(nums);
//        System.out.println(repeatNumber);
//    }

    public void searchTest(){
        /*
        测试用例：target 存在 中间 两边 nums长度(奇数 偶数)
                 target 不存在  nums长度大于0  空数组
                 nums长度 奇数 偶数 0
         */
        int[] nums = {1};
        int target =1;
        SearchSolution searchSolution = new SearchSolution();
        int search = searchSolution.search(nums, target);
        System.out.println(search);
    }

    public void missingNumberTest() {
        /**
         * 测试用例：缺失在两边， 中间
         */
        int[] nums = {0,1,2,3};
        SearchSolution searchSolution = new SearchSolution();
        int number = searchSolution.missingNumber(nums);
        System.out.println(number);
    }

//    public static void main(String[] args) {
//        /**
//         * 测试用例：旋转1个元素 多个元素 n-1个元素
//         *          全部元素重复
//         *         最小元素重复
//         *               不重复  其他重复
//         */
//        int[] nums = {2};
//        SearchSolution searchSolution = new SearchSolution();
//        int number = searchSolution.minArray(nums);
//        System.out.println(number);
//    }

    public void findRepeatNumberTest(){
        int[] nums = {2, 3, 1, 0, 2, 5, 3};


        SearchSolution searchSolution = new SearchSolution();
        int repeatNumber = searchSolution.findRepeatNumber(nums);
        System.out.println(repeatNumber);
    }

    public static void main(String[] args) {
        Test test = new Test();
//        test.findRepeatNumberTest();  //03
//        test.searchTest(); //53-1
        test.missingNumberTest(); //53-2
    }
}
