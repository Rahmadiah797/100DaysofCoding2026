import java.util.Scanner;

public class Day31{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan true/false pertama: ");
        boolean a = in.nextBoolean();
        
        System.out.print("Masukkan true/false kedua: ");
        boolean b = in.nextBoolean();

        System.out.println("a && b (AND) = " + (a && b));
        System.out.println("a || b (OR)  = " + (a || b));
        System.out.println("!a (NOT a)   = " + !a);

        sc.close();
    }
