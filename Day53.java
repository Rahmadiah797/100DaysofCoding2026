import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int umur;

        do {
            System.out.print("Masukkan umur (harus > 0): ");
            umur = input.nextInt();
        } while (umur <= 0);

        System.out.println("Umur kamu: " + umur);
        input.close();
    }
}
