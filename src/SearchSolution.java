import java.util.HashMap;

public class SearchSolution {
    /**
     * 03 数组中重复的数字
     * 哈希表
     * @param nums
     * @return
     */
//    public int findRepeatNumber(int[] nums) {
//
//        HashMap<Integer, Integer> hashMap = new HashMap<>();
//        for (int num : nums) {
//            if (hashMap.containsKey(num)) return num;
//            hashMap.put(num, 1);
//        }
//
//        return 0;
//    }

    /**
     *03
     * 原地交换
     */
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        System.out.println(n);

        for (int i = 0; i<n; i++) {
            while (nums[i] != i){
                System.out.println("before: "+ nums[i] + " "+ nums[nums[i]]);
                System.out.println(nums[i] == nums[nums[i]]);
                if (nums[i] == nums[nums[i]]){
                    return nums[i];
                }

                int temp = nums[i];
                nums[i] = nums[nums[i]];
                nums[temp] = temp;
                System.out.println("after: "+ nums[i] + " "+ nums[nums[i]]);
            }
        }

        return 0;
    }

    /**
     * 53 在排序数组中查找数字
     * 二分法找到目标数字后向左向由搜寻统计
     * 当全部重复的时候时间复杂度是O(n) 与从头到尾遍历一遍没有区别
     * @param nums
     * @param target
     * @return
     */
//    public int search(int[] nums, int target) {
//        int len = nums.length;
//        if (len<=0) return 0;
//
//        int targetIndex = binarySearch(nums, target, 0, len-1);
//        if (targetIndex == -1) return 0;
//        int count = 0;
//        for(int i = targetIndex; i < len; i++){
//            if (nums[i] == target) count ++;
//            else break;
//        }
//
//        for(int i = targetIndex -1; i >= 0; i--){
//            if (nums[i] == target) count ++;
//            else break;
//        }
//        return count;
//    }

    /**
     * 53-1
     * 分别用二分法找出第一个目标值和最后一个目标值
     */
    public int search(int[] nums, int target) {
        int number = 0;
        if (nums.length > 0){
            int firstIndex = binarySearchFirst(nums, target, 0, nums.length-1);
            int lastIndex = binarySearchLast(nums, target, firstIndex == -1?0:firstIndex, nums.length-1);

            System.out.println("first: "+ firstIndex +" last: "+ lastIndex);
            if (firstIndex > -1 && lastIndex > -1) number = lastIndex - firstIndex + 1;
        }

        return number;
    }

    public int binarySearchFirst(int[] nums, int target, int begin, int end) {
        if (begin > end) return -1;
        int mid = (begin + end)/2;
        if (nums[mid] == target){
            if ((mid > 0 && nums[mid-1] != target) || mid == 0){
                return mid;
            }else {
                end = mid -1;
            }
        }else if (nums[mid] > target) end = mid -1;
        else begin = mid + 1;
        return binarySearchFirst(nums, target, begin, end);
    }

    public int binarySearchLast(int[] nums, int target, int begin, int end) {
        if (begin > end) return -1;
        int mid = (begin + end)/2;
        if (nums[mid] == target){
            if ((mid < nums.length-1  && nums[mid+1] != target) || mid == nums.length-1){
                return mid;
            }else {
                begin = mid +1;
            }
        }else if (nums[mid] > target) end = mid -1;
        else begin = mid + 1;
        return binarySearchLast(nums, target, begin, end);
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

    /**
     * 53-2 0~n-1 中缺失的数字
     */
//    public int missingNumber(int[] nums) {
//        int len = nums.length;
//        for (int i=0; i<=len; i++){
//            if (i == len && nums[len-1] != i) return i;
//            if (nums[i] != i) return i;
//        }
//        return 0;
//    }
    public int missingNumber(int[] nums) {
        if (nums.length == 0) return -1;

        int left = 0;
        int right = nums.length -1;
         while (left <= right){
             System.out.println(left + " "+ right);
             int mid = (left + right)/2;
             System.out.println("mid: "+ mid);
             if (nums[mid] != mid){
                 if (mid ==0 || mid -1 == nums[mid-1])
                    return mid;
                 else
                     right = mid -1;
             }else {
                 left = mid +1;
             }
         }

        System.out.println(left + " "+ right+" "+ nums.length);
         if (left == nums.length) return left;

        return -1;
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

}
