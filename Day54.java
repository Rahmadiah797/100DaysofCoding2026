import java.util.Scanner;

public class Day54{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0 || i % 4 == 0) && i % 12 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
