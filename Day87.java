import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.print("Array awal: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("Masukkan posisi yang mau diubah (1-" + n + "): ");
        int posisi = input.nextInt();

        System.out.print("Masukkan angka baru: ");
        int baru = input.nextInt();

        arr[posisi - 1] = baru;

        System.out.print("Array akhir: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        input.close();
    }
}
