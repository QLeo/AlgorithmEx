import java.util.Scanner;

public class ReverseArray {

    static void swap(int[] a, int idx1, int idx2) {

        for (int j = 0; j < a.length ; j++) {
            System.out.printf(a[j] + " " );
        }
        System.out.println();
        System.out.println(String.format("a[%s]와 a[%s]를 교환합니다", idx1, idx2));

        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2 ; i++) {
            swap(a, i, a.length - i - 1);
        }
        System.out.println("역순 정렬을 마쳤습니다");
    }

    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수: ");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num ; i++) {
            System.out.println(String.format("x[%s]", i));
            x[i] = stdIn.nextInt();
        }

        reverse(x);

        System.out.println("요소를 역순으로 정렬을 마쳤습니다.");
        for (int i = 0; i < num ; i++) {
            System.out.printf(String.format("%s ", x[i]));
        }

        System.out.println();
        System.out.println("===================");
        System.out.println();

        System.out.println(String.format("총합은 %d 입니다." , sumOf(x)));
    }
}
