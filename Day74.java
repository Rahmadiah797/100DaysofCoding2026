import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.println("Jumlah huruf kamu: " + nama.length());
        System.out.println("Versi teriak: " + nama.toUpperCase());
        System.out.println("Versi bisik: " + nama.toLowerCase());
    }
}
