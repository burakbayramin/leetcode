import java.util.HashMap;

public class Q13 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int res = romanToInt(s);
        System.out.println(res);
    }

    public static int romanToInt(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int len = s.length();

        int[] nums = new int[len];

        for (int i = 0; i < len; i++) {
            nums[i] = map.get(s.charAt(i));
        }

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i == len-1 || nums[i]>= nums[i+1]) {
                sum += nums[i];
            } else {
                sum -= nums[i];
            }
        }

        return sum;
    }
}
