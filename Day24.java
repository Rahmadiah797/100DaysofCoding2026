import java.util.Scanner;
public class Day24 {
    public static void main(String[] args) {
        Scanner Op = new Scanner (System.in);

        System.out.printf("Panjang = ");
        int panjang = Op.nextInt();

        System.out.printf("Lebar = ");
        int lebar = Op.nextInt();

        int luas = panjang * lebar ;

        System.out.println("Luas Persegi = " + luas );
    }
}
