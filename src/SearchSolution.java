import java.util.HashMap;

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

        return -1;
    }
}
