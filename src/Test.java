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

//    public static void main(String[] args) {
//        /*
//        测试用例：target 存在 中间 两边 nums长度(奇数 偶数)
//                 target 不存在  nums长度大于0  空数组
//                 nums长度 奇数 偶数 0
//         */
//        int[] nums = {5,6,7,7,8,8,10};
//        int target =7;
//        SearchSolution searchSolution = new SearchSolution();
//        int search = searchSolution.search(nums, target);
//        System.out.println(search);
//    }

//    public static void main(String[] args) {
//        /**
//         * 测试用例：缺失在两边， 中间
//         */
//        int[] nums = {0,1,2,3,4,5,6,7,9};
//        SearchSolution searchSolution = new SearchSolution();
//        int number = searchSolution.missingNumber(nums);
//        System.out.println(number);
//    }

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

//    public static void main(String[] args) {
//        /**
//         * 测试用例
//         *          空字符串
//         *          一个字符
//         *          非空 全部重复
//         *              多个重复
//         *              一个重复
//         */
//        String s = "ulgsjkl";
//        SearchSolution searchSolution = new SearchSolution();
//        char c = searchSolution.firstUniqChar(s);
//        System.out.println(c);
//    }

    public void searchRepeatCountTest() {
        /*
        测试用例 1.中间重复 {5,7,7,8,8,10}、一次{1,2,3,8,9,11}{5,7,7,8,9,10}、0次{1,2,3,7,9,11}
                2.第一个数在最前面重复{8,8,8,8,8,9}{8,8,8,8,8,8}、一次{8,9,9,9,9,11}、0次
                3.最后一个数在数组最右边重复{1,8,8,8,8,8}{8,8,8,8,8,8}、一次{5,6,7,7,7,8}、0次
         */
        int[] nums = {2,2};
        int target = 2;
        SearchSolution searchSolution = new SearchSolution();
        int count = searchSolution.searchRepeatCount(nums, target);
        System.out.println(count);
    }

    public void minArrayBinaryTest() {
        int[] nums = {1,1};
        SearchSolution searchSolution = new SearchSolution();
//        int min = searchSolution.minArrayBinary(nums);
        int min = searchSolution.minArrayGuanfang(nums);
        System.out.println(min);
    }

    public static void main(String[] args) {
        Test test = new Test();
//        test.searchRepeatCountTest();
        test.minArrayBinaryTest();
    }
}
