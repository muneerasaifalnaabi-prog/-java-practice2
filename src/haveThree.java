public class haveThree {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 1, 3};
        System.out.println(haveThree(arr));
    }


    public static Boolean  haveThree(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 3) {
                count++;
            }

            if (i < arr.length - 1 && arr[i] == 3 && arr[i + 1] == 3) {
                return false;
            }
        }

        return count == 3;

    }}
