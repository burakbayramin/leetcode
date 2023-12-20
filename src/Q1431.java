import java.util.ArrayList;
import java.util.List;

public class Q1431 {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        List<Boolean> l = kidsWithCandies(candies, extraCandies);
        for (boolean val : l) {
            System.out.println(val);
        }
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = -1;
        for (int i : candies) {
            if (i > max) {
                max = i;
            }
        }
        List<Boolean> res = new ArrayList<>();
        for (int i : candies) {
            if (i + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}
