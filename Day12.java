import java.util.Scanner;

public class Day12{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data biodata
        System.out.print("Nama Lengkap   : ");
        String nama = input.nextLine();

        System.out.print("Tempat Lahir   : ");
        String tempatLahir = input.nextLine();

        System.out.print("Umur            : ");
        int umur = input.nextInt();

        System.out.print("Tinggi Badan   : ");
        double tinggiBadan = input.nextDouble();

        System.out.print("Berat Badan    : ");
        double beratBadan = input.nextDouble();

        System.out.print("Jenis Kelamin  : ");
        char jenisKelamin = input.next().charAt(0);

        System.out.print("Semester       : ");
        int semester = input.nextInt();

        System.out.print("IPK            : ");
        double ipk = input.nextDouble();

        input.nextLine();

        System.out.print("Status Mahasiswa : ");
        String status = input.nextLine();

        // Output biodata
        System.out.println();
        System.out.println("================================");
        System.out.println("\tBIODATA MAHASISWA");
        System.out.println("================================");

        System.out.printf("Nama Lengkap\t: %s%n", nama);
        System.out.printf("Tempat Lahir\t: %s%n", tempatLahir);
        System.out.printf("Umur\t\t: %d tahun%n", umur);
        System.out.printf("Tinggi Badan\t: %.2f cm%n", tinggiBadan);
        System.out.printf("Berat Badan\t: %.2f kg%n", beratBadan);
        System.out.printf("Jenis Kelamin\t: %c%n", jenisKelamin);
        System.out.printf("Semester\t: %d%n", semester);
        System.out.printf("IPK\t\t: %.2f%n", ipk);
        System.out.printf("Status\t\t: %s%n", status);

        System.out.println("================================");

        
    }
                          }
