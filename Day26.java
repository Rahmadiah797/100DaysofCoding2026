import java.util.Scanner;

public class Day26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//SOAL 2 ICL
        System.out.print("tahun sekarang: ");
        int tahunSekarang = input.nextInt();

        System.out.print("tahun lahir: ");
        int tahunLahir = input.nextInt();

        int umur = tahunSekarang - tahunLahir;

        System.out.println("Umur kamu = " + umur + " tahun");
    }
          }
