import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("=== MENU ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Ayam Bakar");
        System.out.print("Pilih (1-3): ");
        int pilih = in.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Kamu pilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Kamu pilih Mie Goreng");
                break;
            case 3:
                System.out.println("Kamu pilih Ayam Bakar");
                break;
            default:
                System.out.println("Pilihan tidak ada");
        }
    }
}
