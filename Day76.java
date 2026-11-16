import java.util.Scanner;

public class Day76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan teks: ");
        String teks = input.nextLine();

        System.out.println("Substring: " + teks.substring(0, 3));
        System.out.println("Replace: " + teks.replace("a", "o"));
        System.out.println("Trim: " + teks.trim());

        input.close();
    }
}
