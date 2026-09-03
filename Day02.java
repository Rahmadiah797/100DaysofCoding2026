public class Day02 {
    public static void main(String[] args) {
        String nama, alamat, hobi, nim;
        int umur;

        nama = "Rahmadiah";
        alamat = "Pambusuang";
        hobi = "Menari";
        umur = 18;
        nim = "D0226321";

        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Hobi: " + hobi);
        System.out.println("Umur: " + umur);
        System.out.println("NIM: " + nim);
        System.out.println("\n");

        System.out.print("Nama: " + nama + "\n");
        System.out.print("Alamat: " + alamat + "\n");
        System.out.print("Hobi: " + hobi + "\n");
        System.out.print("Umur: " + umur + "\n");
        System.out.print("NIM: " + nim + "\n");
        System.out.print("\n");

        System.out.printf("Nama: %s%n", nama);
        System.out.printf("Alamat: %s%n", alamat);
        System.out.printf("Hobi: %s%n", hobi);
        System.out.printf("Umur: %d%n", umur);
        System.out.printf("NIM: %s%n", nim);
    }
}
