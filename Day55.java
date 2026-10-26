import java.util.Scanner;
public class Day55{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input batas loop
        for (int i = 1; i <= n; i++) {
            if (i == 2) continue; // skip angka 2
            if (i == 5) break;    // berhenti di 5
            if (i == 8) return;   // keluar program di 8
            System.out.print(i + " ");
        }
    }
        }
