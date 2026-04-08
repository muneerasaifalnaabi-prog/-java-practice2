public class fizzArray2 {
    public static void main(String[] args) {
        String[] arr = fizzArray2(4);
        for (String n:arr){
            System.out.print(n+ " ");
        }

    }
    public static String[] fizzArray2(int n) {
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i+"";
        }

        return arr;
    }
}
