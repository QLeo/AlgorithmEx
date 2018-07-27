public class GuGuDan {
    public static void main(String[] args) {
        // 구구단 이쁘게 짜기!
        for (int i = 0; i < 10; i++) {

            if (i == 0) {
                System.out.printf(String.format("%5s", "|"));
            }

            if (i == 1) {
                System.out.println("----+---------------------------");
            }

            if (i > 0) {
                System.out.printf("%3d |", i);
            }

            for (int j = 1; j < 10 ; j++) {
                if (i == 0)
                    System.out.printf(String.format("%3d", j));
                else
                    System.out.printf(String.format("%3d", i * j));
                    //System.out.printf(String.format("%3d", i + j));
            }
            System.out.println();
        }
    }
}
