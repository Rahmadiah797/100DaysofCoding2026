import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kata1 = input.nextLine();
        String kata2 = input.nextLine();

        System.out.println("Equals: " + kata1.equals(kata2));
        System.out.println("EqualsIgnoreCase: " + kata1.equalsIgnoreCase(kata2));
        System.out.println("Contains: " + kata1.contains(kata2));
        System.out.println("IsEmpty: " + kata1.isEmpty());

        input.close();
    }
}
