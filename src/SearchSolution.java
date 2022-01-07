import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SearchSolution {
    public int findRepeatNumber(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) return num;
            hashMap.put(num, 1);
        }

        return 0;
    }

    public int search(int[] nums, int target) {
        int len = nums.length;
        if (len<=0) return 0;

        int targetIndex = binarySearch(nums, target, 0, len-1);
        if (targetIndex == -1) return 0;
        int count = 0;
        for(int i = targetIndex; i < len; i++){
            if (nums[i] == target) count ++;
            else break;
        }

        for(int i = targetIndex -1; i >= 0; i--){
            if (nums[i] == target) count ++;
            else break;
        }

        return count;
    }

    public int binarySearch(int[] nums, int target, int begin, int end){
        System.out.println("m: " + begin + " n: " + end);
        int m = begin;
        int n = end;
        int mid = (begin+end)/2;

        System.out.println("m: "+m+" n: "+n+" mid: "+mid+" target: "+target+" nums[mid]: "+nums[mid]);

        if (m > n){
            return -1;
        }

        if (nums[mid] == target){
            System.out.println("why not: "+mid);
            return mid;
        }else if (nums[mid] > target){
            n = mid - 1;
        }else if(nums[mid] < target) {
            m = mid + 1;
        }

        return binarySearch(nums, target, m, n);
    }

    public int missingNumber(int[] nums) {
        int len = nums.length;
        for (int i=0; i<=len; i++){
            if (i == len && nums[len-1] != i) return i;
            if (nums[i] != i) return i;
        }
        return 0;
    }

    public int minArray(int[] numbers) {
        int prim = 0;
        if (numbers.length > 0) prim = numbers[0];
        for (int i = numbers.length -1; i >=0; i--){
            System.out.println(numbers[i] + " "+ numbers[Math.max(i - 1, 0)]);
            if (numbers[i] < numbers[Math.max(i - 1, 0)]) return numbers[i];
        }

        return prim;
    }

    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : chars){
            Integer num = map.get(c);
            map.put(c, (num == null? 1: ++num));
        }

        for (char c : chars){
            if (map.get(c) == 1) return c;
        }


        return ' ';
    }

    public int searchRepeatCount(int[] nums, int target) {
        int len = nums.length;
        if (len<=0) return 0;
        int count = 0;

        //二分查找第一个target的下标
        int firstIndex = findFirstIndex(nums, target, 0, len-1);
        System.out.println("firstIndex: " + firstIndex);
        //二分查找最后一个target的下标
        int lastIndex = findLastIndex(nums, target, 0, len-1);
        System.out.println("lastIndex: " + lastIndex);

        count = lastIndex - firstIndex +1;
        System.out.println(count);

        if (lastIndex == -1 && firstIndex == -1) {
            count = 0;
        }

        return count;
    }

    public int findFirstIndex(int[] nums, int k, int left, int right) {
         System.out.print("findFirstIndex left: " + left + " right: " + right);
        if (left > right) return -1;
        int mid = (right + left) / 2;
         System.out.println(" mid: "+mid+" nums[mid]: " + nums[mid]);
        if (nums[mid] == k){
            if (mid == 0 || nums[mid - 1] < k){
                return mid;
            }
        }
        if (nums[mid] < k || (nums[mid]==k && nums[mid-1] < k)){
            left = mid +1;
        }
        if (nums[mid] > k || (nums[mid]==k && nums[mid - 1] >= k)) {
            right = mid -1;
        }

        return findFirstIndex(nums, k, left, right);
    }

    public int findLastIndex(int[] nums, int k, int left, int right) {
         System.out.print("findLastIndex left: "+left+" right: "+right);
        if (left > right) return -1;

        int mid = (right + left) / 2;
         System.out.println(" nums[mid]: " + nums[mid]);
        if (nums[mid] == k){
            if (mid == nums.length - 1 || nums[mid + 1] > k) {
                return mid;
            }
        }
//        if (nums[mid] <k || (nums[mid] ==k && nums[mid-1] <= k) ){ //{2,2}会失败
        if (nums[mid] <k || (nums[mid] ==k && nums[mid+1] == k) ){
            left = mid +1;
        }
//        if (nums[mid] > k || (nums[mid] ==k && nums[mid - 1] > k)) {
        if (nums[mid] > k || (nums[mid] ==k && nums[mid+1]  < k)) {
            right = mid -1;
        }

        return findLastIndex(nums, k, left, right);
    }

}
