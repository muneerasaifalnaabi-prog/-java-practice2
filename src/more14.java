public class more14 {
    public static void main(String[] args) {
        int[] arr = {4, 4, 1};
        System.out.println(more14(arr));

    }
    public static boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count1++;
            } else if (nums[i] == 4) {
                count4++;
            }
        }

        return count1 > count4;
    }
}

