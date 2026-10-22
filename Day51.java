import java.util.Scanner;
public class App{
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Mau diulang berapa kali: ");
       int n = in.nextInt();

       for (int i = 1; i <= n; i++) {
           System.out.println("Perulangan ke-" + i);
       }
    }
}
