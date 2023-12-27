import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Q2215 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3 };
        int[] nums2 = { 2, 4, 6 };
        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for (int num : nums1) {
            s1.add(num);
        }

        for (int num : nums2) {
            s2.add(num);
        }

        List<Integer> l1 = new ArrayList<>();
        for (int uniq1 : s1) {
            if (!s2.contains(uniq1)) {
                l1.add(uniq1);
            }
        }

        List<Integer> l2 = new ArrayList<>();
        for (int uniq2 : s2) {
            if (!s1.contains(uniq2)) {
                l2.add(uniq2);
            }
        }
        return Arrays.asList(l1, l2);
    }

    // public static List<Integer> find(int[] nums1, int[] nums2) {
    // HashSet<Integer> set = new HashSet<>();
    // for (int n : nums2) {
    // set.add(n);
    // }

    // HashSet<Integer> list = new HashSet<>();
    // for (int n : nums1) {
    // if (!set.contains(n)) {
    // list.add(n);
    // }
    // }

    // return list.stream().toList();
    // }
}
