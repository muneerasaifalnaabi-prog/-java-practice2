public class tripleUp {
    public static void main(String[] args) {
        int[] arr = {4,5,6};
        System.out.println(tripleUp(arr));

    }
    public static  Boolean tripleUp(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<arr[i+1] && arr[i+1]<arr[i+2]){
                return true;
            }
        }
        return false;
    }
}
