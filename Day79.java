import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Mau isi berapa data: ");
        int jumlah = in.nextInt();

        int[] nilai = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            nilai[i] = in.nextInt();
        }

        System.out.println("Isi array-nya:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Kotak ke-" + i + " isinya " + nilai[i]);
        }
    }
}
