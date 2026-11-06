import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int baris = in.nextInt();
        int kolom = in.nextInt();

        for(int i = 1; i <= baris; i++){
            for(int j = 1; j <= kolom; j++){
                if((i + j) % 2 == 0){
                    System.out.print("# ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
