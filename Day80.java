import java.util.Scanner;

public class Day80{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = in.nextInt();
        }

        System.out.print("Mau lihat nomor berapa (0-4): ");
        int index = in.nextInt();

        System
