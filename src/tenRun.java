public class tenRun {
    public static void main(String[] args) {
        int[] arr = {2, 10, 3, 4, 20, 5};
        int[] nums = tenRun(arr);
        for (Integer n : nums) {
            System.out.println(n);


        }
    }
    public static int[]  tenRun(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 10 == 0) {
                if (arr[i + 1] % 10 != 0) {
                    arr[i + 1] = arr[i];
                }
            }
        }
        return arr;
    }

}
