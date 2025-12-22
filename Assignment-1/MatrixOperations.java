import java.util.Scanner;

class MatrixOperations {

    static void add(int[][] a, int[][] b, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(a[i][j] + b[i][j] + " ");
            System.out.println();
        }
    }

    static void subtract(int[][] a, int[][] b, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(a[i][j] - b[i][j] + " ");
            System.out.println();
        }
    }

    static void multiply(int[][] a, int[][] b, int n, int m, int p) {
        int[][] c = new int[n][p];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < p; j++)
                for (int k = 0; k < m; k++)
                    c[i][j] += a[i][k] * b[k][j];

        for (int[] row : c) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }

    static void transpose(int[][] a, int n, int m) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }

    static boolean isSquare(int n, int m) {
        return n == m;
    }

    static boolean isDiagonal(int[][] a, int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i != j && a[i][j] != 0)
                    return false;
        return true;
    }

    static boolean isIdentity(int[][] a, int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0))
                    return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                b[i][j] = sc.nextInt();

        add(a, b, n, m);
        subtract(a, b, n, m);

        if (isSquare(n, m)) {
            multiply(a, b, n, m, m);
            transpose(a, n, m);
            System.out.println(isDiagonal(a, n));
            System.out.println(isIdentity(a, n));
        }
    }
}
