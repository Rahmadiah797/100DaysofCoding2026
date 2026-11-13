import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Nasi Goreng");
            System.out.println("2. Mie Goreng");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memilih Nasi Goreng");
                    break;
                case 2:
                    System.out.println("Anda memilih Mie Goreng");
                    break;
                case 3:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
            }

        } while (pilihan != 3);

        input.close();
    }
}
