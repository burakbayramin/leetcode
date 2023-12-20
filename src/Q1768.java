public class Q1768 {
    public static void main(String[] args) {
        String w1 = "abc";
        String w2 = "pqrfg";
        System.out.println(mergeAlternately(w1, w2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                sb.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
