public class isEverywhere {
    public static void main(String[] args) {
        int[] arr ={1,2,1,2,1};
        int n = 1;
        System.out.println(isEverywhere(arr,n));


    }
    public static Boolean  isEverywhere(int[] arr ,int n){
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != n && arr[i + 1] != n) {
                return false;
            }
        }

        return true;
    }
    }

