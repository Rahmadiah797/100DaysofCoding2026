import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama kamu: ");
        String nama = input.nextLine();

        System.out.println("Panjang: " + nama.length());
        System.out.println("Besar: " + nama.toUpperCase());
        System.out.println("Kecil: " + nama.toLowerCase());
        System.out.println("Sama dengan Arham? " + nama.equals("Arham"));
        System.out.println("Sama dengan arham (bodo amat kapital)? " + nama.equalsIgnoreCase("arham"));
        System.out.println("Ada huruf 'a'? " + nama.contains("a"));
        System.out.println("Kosong? " + nama.isEmpty());

        input.close();
    }
}
