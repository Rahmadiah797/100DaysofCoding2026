import java.util.Scanner;

public class Day83 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] n = new int[5];
        int jumlah = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Indeks ke-" + i + " : ");
            n[i] = input.nextInt();
            jumlah = jumlah + n[i];
        }
        System.out.println("Hasil Penjumlahan : " + jumlah);
    }
}
