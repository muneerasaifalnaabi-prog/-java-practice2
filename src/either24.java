public class either24 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 4};
        System.out.println(either24(arr));


    }
    public static boolean either24(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (((nums[i] == 2) && (nums[i + 1] == 2)) || ((nums[i] == 4) && (nums[i + 1] == 4))) {
                return true;
            }
        }
        return false;

    }

}
