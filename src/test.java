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

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};


        SearchSolution searchSolution = new SearchSolution();
        int repeatNumber = searchSolution.findRepeatNumber(nums);
        System.out.println(repeatNumber);
    }
}
