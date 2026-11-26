import java.util.Scanner;

public class Day86{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }

        System.out.print("Masukkan angka yang dicari: ");
        int cari = input.nextInt();

        int posisi = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == cari) {
                posisi = i;
                break;
            }
        }

        if (posisi != -1) {
            System.out.println("Angka " + cari + " ditemukan di posisi ke-" + (posisi + 1));
        } else {
            System.out.println("Angka " + cari + " tidak ditemukan");
        }

        input.close();
    }
}
