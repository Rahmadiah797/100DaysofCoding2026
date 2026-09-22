import java.util.Scanner;

public class Day21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        String teks = input.nextLine();

        int angka = Integer.parseInt(teks);

        System.out.println("Hasil ubah: " + angka);
    }
}
