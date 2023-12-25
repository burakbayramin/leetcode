public class Q151 {
    public static void main(String[] args) {
        String s = " a good   example ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length-1; i > 0; i--) {
            sb.append(str[i] + " ");
        }
        sb.append(str[0]);
        return sb.toString();
    }
}
