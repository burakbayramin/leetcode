public class Q1071 {
    public static void main(String[] args) {
        String s1 = "ABABAB";
        String s2 = "ABAB";
        System.out.println(gcdOfStrings(s1, s2));
    }

    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
