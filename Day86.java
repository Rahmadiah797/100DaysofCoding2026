import java.util.Scanner;

public class Day86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        int minimum = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }

        System.out.print("Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Angka minimal: " + minimum);

        input.close();
    }
}
