public class test {

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

    public static void main(String[] args) {
        /**
         * 测试用例：旋转1个元素 多个元素 n-1个元素
         *         最小元素重复
         *               不重复
         */
        int[] nums = {5,1,2,3,4};
        SearchSolution searchSolution = new SearchSolution();
        int number = searchSolution.minArray(nums);
        System.out.println(number);
    }
}
