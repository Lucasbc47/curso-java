import java.util.Random;
import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int chosen = random.nextInt(1000);
        int choice;

        while (true){
            System.out.println("Insira numero 1 a 1000");
            choice = scanner.nextInt();

            if (choice > chosen){
                System.out.println("Errado! menor que " + choice);
            }

            if (choice < chosen){
                System.out.println("Errado maior que " + choice);
            }

            if (choice == chosen){
                System.out.println("Boa acertou numero é " + chosen);
                break;
            }
        }

    }
}
