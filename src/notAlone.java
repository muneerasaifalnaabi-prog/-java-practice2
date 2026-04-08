public class notAlone {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};;
        int value = 2;
        //System.out.println(notAlone(arr,n));
        int[] nums = notAlone(arr,value);
        for (Integer n : nums) {
            System.out.print(n+" ");


        }


    }
    public static int[] notAlone(int[] nums, int n) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == n && nums[i - 1] != n && nums[i + 1] != n) {
                if (nums[i - 1] > nums[i + 1]) {
                    nums[i] = nums[i - 1];
                } else {
                    nums[i] = nums[i + 1];
                }
            }
        }
        return nums;

    }
}
