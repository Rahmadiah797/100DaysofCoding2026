import java.util.Scanner;
public class Day40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double angka = in.nextDouble();

        if (angka % 1 == 0) {
            System.out.println("Bilangan Bulat");
        } else {
            System.out.println("Bilangan Desimal");
        }
    }
}
