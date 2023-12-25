public class Q334 {
    public static void main(String[] args) {
        int[] nums = { 20, 100, 10, 12, 5, 13 };
        System.out.println(increasingTriplet(nums));
    }

    public static boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;

        for (int big : nums) {
            if (big <= small) {
                small = big;
            } else if (big <= mid) {
                mid = big;
            } else
                return true;
        }
        return false;
    }
}
