import java.io.PrintStream;

public class Pyramid {
    public static void main(String[] args) {
        pyramidStar(20);
        //pyramidNum(20);
    }

    static void pyramidStar(int a) {
        int n = a;
        for (int i = 0; i < a ; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    static void pyramidNum(int a) {
        int n = a;
        for (int i = 0; i < a ; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.printf(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.printf(String.valueOf(i+1));
            }
            System.out.println();
        }
    }
}
