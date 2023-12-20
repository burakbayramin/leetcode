import java.util.HashSet;

public class Q345 {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {
        char[] stringArray = s.toCharArray();

        HashSet<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');

        int left = 0, right = stringArray.length - 1;
        while (left < right) {
            if (vowels.contains(stringArray[left])) {
                if (vowels.contains(stringArray[right])) {
                    char temp = stringArray[left];
                    stringArray[left] = stringArray[right];
                    stringArray[right] = temp;
                    left++;
                    right--;
                } else {
                    right--;
                }
            } else {
                left++;
            }
        }

        return String.valueOf(stringArray);
    }
}
