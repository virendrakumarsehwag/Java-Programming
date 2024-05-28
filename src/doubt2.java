public class doubt2 {
    public static void main(String[] args) {
        int n;

        n = 5;
        // upper section
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if ((j < n - i - 1) || (j >= n + i)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }

        // lower section
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if ((j <= i) || (j >= 2 * (n - 1) - i)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");

        }
    }
}
