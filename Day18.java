import java.util.Scanner;
public class Day18 {
    public static void main(String[] args) {
        
      Scanner input = new Scanner(System.in);
      
      System.out.print("Masukkan bilangan bulat: ");
      int angka = input.nextInt();
      
      // Konversi otomatis dari int ke double 
      double hasil = angka;
      
      System.out.println("Nilai int    = " + angka);
      System.out.println("Nilai double = " + hasil);
        
      input.close();
    }
}
