public class zeroMax {
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3};
        int[] nums =  zeroMax (arr);
        for (Integer n : nums) {
            System.out.print(n+" ");


        }


    }
    public static int[]  zeroMax(int[] nums) {
        int maxOdd = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] % 2 != 0) {
                if (nums[i] > maxOdd) {
                    maxOdd = nums[i];
                }
            }

            if (nums[i] == 0) {
                nums[i] = maxOdd;
            }
        }

        return nums;
    }
    }



