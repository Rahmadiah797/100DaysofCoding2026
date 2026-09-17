import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();
        
        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();

        int sisa = a % b;

        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Sisa bagi " + a + " % " + b + " = " + sisa);

        input.close();
    }
}
