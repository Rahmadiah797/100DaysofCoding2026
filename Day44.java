import java.util.Scanner;
public class Day44 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nilai = in.nextInt();

        if (nilai >= 85) {
            System.out.println("A");
        } else if (nilai >= 70) {
            System.out.println("B");
        } else if (nilai >= 60) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
            }
