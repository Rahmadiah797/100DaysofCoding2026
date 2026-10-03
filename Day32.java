import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Angka 1: ");
        int a = sc.nextInt();
        System.out.print("Angka 2: ");
        int b = sc.nextInt();

        // Increment Decrement
        System.out.println("Increment a: " + (++a));
        System.out.println("Decrement b: " + (--b));

        // Perbandingan
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));

        // Logika
        System.out.println("AND (a>0 && b>0): " + (a>0 && b>0));
        System.out.println("OR (a>0 || b>0): " + (a>0 || b>0));
        System.out.println("NOT !(a>0): " + !(a>0));

        sc.close();
    }
}z
