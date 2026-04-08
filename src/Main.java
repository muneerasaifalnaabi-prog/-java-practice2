//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr ={1,1,4,4,};
        System.out.println(only14(arr));

    }
    public static Boolean only14(int[] arr){
        for (int i =0;i<arr.length;i++){
            if (arr[i]==1 || arr[i]==4){
                return true;
            }
        }
        return false;
    }
}