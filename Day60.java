import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int N = in.nextInt();

        int jumlah = 0;
        for (int i = 1; i <= N; i++) {
            jumlah += i;
        }
        System.out.println("Jumlah 1 sampai " + N + " = " + jumlah);
        
        in.close();
    }
}
