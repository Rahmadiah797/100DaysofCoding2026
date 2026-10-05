import java.util.Scanner;

public class Day34{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai (0-100): ");
        int nilai = input.nextInt();

        if (nilai >= 85) {
            System.out.println("Lulus dengan Sangat Baik");
        } else if (nilai >= 75) {
            System.out.println("Lulus dengan Baik");
        } else if (nilai >= 60) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }

        input.close();
    }
                                    }
