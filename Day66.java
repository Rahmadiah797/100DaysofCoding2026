import java.util.Scanner;

public class Day66{
    public static void main(String[] args) throws Exception {
        Scanner in= new Scanner(System.in);

    for (int i = 0; i< 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print((i + j) % 2 == 0 ? "# " : "0 ");
                
            }
            System.out.println();
        }
    }
}
