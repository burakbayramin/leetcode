import java.util.HashMap;
import java.util.HashSet;

public class Q1207 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }
}
