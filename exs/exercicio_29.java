import java.util.Scanner;

public class exercicio_29 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número");
        int number = input.nextInt();

        for (int i=0; i < number; i++){
            System.out.println();
            for (int x=0; x < i; x++) {
                System.out.print(x + "");
                i++;
            }
        }



    }
}
