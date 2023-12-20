import java.util.Arrays;

public class Q14 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f = strs[0];
        String l = strs[strs.length-1];
        int i = 0;
        while (i < f.length()) {
            if (f.charAt(i) == l.charAt(i)) {
                i++;
            }else {
                break;
            }
        }
        return f.substring(0, i);
    }
}
