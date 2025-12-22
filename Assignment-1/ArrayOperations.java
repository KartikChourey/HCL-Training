import java.util.Scanner;
import java.util.Arrays;

class ArrayOperations {

    static int insert(int[] arr, int n, int pos, int val) {
        for (int i = n; i > pos; i--)
            arr[i] = arr[i - 1];
        arr[pos] = val;
        return n + 1;
    }

    static int delete(int[] arr, int n, int pos) {
        for (int i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
        return n - 1;
    }

    static int linearSearch(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }

    static int binarySearch(int[] arr, int n, int key) {
        int l = 0, r = n - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == key)
                return m;
            if (arr[m] < key)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    static int max(int[] arr, int n) {
        int m = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > m)
                m = arr[i];
        return m;
    }

    static void countEvenOdd(int[] arr, int n) {
        int e = 0, o = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                e++;
            else
                o++;
        }
        System.out.println(e + " " + o);
    }

    static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[100];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int pos = sc.nextInt();
                int val = sc.nextInt();
                n = insert(arr, n, pos, val);
                break;

            case 2:
                pos = sc.nextInt();
                n = delete(arr, n, pos);
                break;

            case 3:
                System.out.println(linearSearch(arr, n, sc.nextInt()));
                break;

            case 4:
                Arrays.sort(arr, 0, n);
                System.out.println(binarySearch(arr, n, sc.nextInt()));
                break;

            case 5:
                System.out.println(max(arr, n));
                break;

            case 6:
                countEvenOdd(arr, n);
                break;

            case 7:
                insertionSort(arr, n);
                break;
        }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
