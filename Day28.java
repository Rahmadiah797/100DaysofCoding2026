import java.util.Scanner;

public class Day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();
        
        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();
        
        System.out.println(a + " == " + b + " hasilnya: " + (a == b));
        System.out.println(a + " != " + b + " hasilnya: " + (a != b));
        
        sc.close();
    }
          }
