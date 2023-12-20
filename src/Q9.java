public class Q9 {
    public static void main(String[] args) {
        int x = 12121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int count = 0;
        char[] arr = String.valueOf(x).toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[arr.length - i - 1]) {
                count++;
            }
        }
        if (count == arr.length / 2) {
            return true;
        }
        return false;
    }
}

