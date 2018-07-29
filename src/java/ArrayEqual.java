import java.util.Arrays;

public class ArrayEqual {

    static void copy(int[] a , int[] b) {
        for (int i = 0; i < a.length ; i++) {
            a[i] = b[i];
        }
    }

    static void rcopy(int[] a , int[] b) {
        for (int i = 0; i < a.length ; i++) {
            a[i] = b[a.length - i - 1];
        }
    }

    public static void main(String[] args) {

        int[] a = new int[5];
        int[] b = {1,2,3,4,5};


        //copy(a,b);
        rcopy(a,b);

        System.out.println(Arrays.toString(a));
    }
}
