import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < angka.length; i++) {
            angka[i] = input.nextInt();
        }

        for (int i = 0; i < angka.length; i++) {
            System.out.println("Elemen ke-" + (i + 1) + ": " + angka[i]);
        }

        input.close();
    }
}
