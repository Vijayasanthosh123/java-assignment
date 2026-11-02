public class Pattern {
    static int n = 5;

    static void square1() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    static void number1() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void number2() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void number3() {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void number4() {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

    static void zeroOne() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j) % 2 + " ");
            }
            System.out.println();
        }
    }

    static void palindrome() {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++)
                System.out.print("  ");

            for (int j = i; j >= 1; j--)
                System.out.print(j + " ");

            for (int j = 2; j <= i; j++)
                System.out.print(j + " ");

            System.out.println();
        }
    }

    static void rhombus() {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");

            for (int j = 1; j <= n; j++)
                System.out.print("* ");

            System.out.println();
        }
    }

    static void diamond() {
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }
    }

    static void butterfly() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            for (int s = 1; s <= 2 * (n - i); s++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            for (int s = 1; s <= 2 * (n - i); s++)
                System.out.print("  ");

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        square1();
        number1();
        number2();
        number3();
        number4();
        zeroOne();
        palindrome();
        rhombus();
        diamond();
        butterfly();
    }
}
