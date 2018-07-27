import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        Scanner stdIn = new Scanner(System.in);
        System.out.println("직삼각형을 출력합니다: ");
        int a;
        a = stdIn.nextInt();

        triangle(a);
        System.out.println("----------");
        triangleLU(a);
        System.out.println("----------");
        triangleRU(a);
        System.out.println("----------");
        triangleRB(a);

    }

    // 왼쪽아래가 직각인 이등변삼각형
    static void triangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.printf("%3s", "*");
            }
            System.out.println();
        }
    }

    // 왼쪽위가 직각인 이등변삼각형
    static void triangleLU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i ; j++) {
                System.out.printf("%3s", "*");
            }
            System.out.println();
        }
    }

    // 오른쪽위가 직각인 이등변삼각형
    static void triangleRU(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if (j >= i)
                    System.out.printf("%3s", "*");
                else
                    System.out.printf("%3s", "");
            }
            System.out.println();
        }
    }

    // 오른쪽 아래가 직각인 이등변삼각형
    static void triangleRB(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0 ; j--) {
                if (j <= i)
                    System.out.printf("%3s", "*");
                else
                    System.out.printf("%3s", "");
            }
            System.out.println();
        }
    }

}
