import java.util.Scanner;
public class exercicio_30 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número");
        int number = input.nextInt();

        for (int i=1; i <= number; i++){
            System.out.println();
            for (int x=1; x <= i; x++) {
                System.out.print(x++);
            }
        }



    }
}
