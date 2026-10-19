import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Angka 1: ");
        double a = in.nextDouble();
        System.out.print("Operator (+ - * / %): ");
        char op = in.next().charAt(0);
        System.out.print("Angka 2: ");
        double b = in.nextDouble();

        switch (op) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a+b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a-b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a*b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a + " / " + b + " = " + (a/b));
                } else {
                    System.out.println("Tidak bisa dibagi 0");
                }
                break;
            case '%':
                System.out.println(a + " % " + b + " = " + (a%b));
                break;
            default:
                System.out.println("Operator salah");
        }
    }
}
