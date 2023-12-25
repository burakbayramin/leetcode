public class Q238 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] result = productExceptSelf(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int N = nums.length;

        int[] outputArr = new int[N];

        outputArr[0] = 1;

        for (int i = 1; i < N; i++) {
            outputArr[i] = nums[i - 1] * outputArr[i - 1];
        }

        int R = 1;

        for (int i = N-1; i >= 0; i--) {
            outputArr[i] = outputArr[i] * R;
            R = R * nums[i];
        }

        return outputArr;
        
        // int n = nums.length;
        // int[] left = new int[n];
        // int[] right = new int[n];
        // int[] res = new int[n];

        // left[0] = 1;
        // right[n - 1] = 1;

        // for (int i = 1; i < n; i++) {
        //     left[i] = nums[i - 1] * left[i - 1];
        // }
        // for (int i = n - 2; i >= 0; i--) {
        //     right[i] = nums[i + 1] * right[i+1];
        // }
        // for (int i = 0; i < n; i++) {
        //     res[i] = left[i] * right[i];
        // }
        // return res;
    }

}
