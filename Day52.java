import java.util.Scanner;

public class Day52{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Mau diulang berapa kali: ");
        int n = in.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.println("Perulangan ke-" + i);
            i++;
        }
    }
}
