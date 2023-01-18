import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira numero para ver a tabuada: ");
        int numero = scanner.nextInt();
        System.out.println("Insira até que número deseja ver a tabuada");
        int ate = scanner.nextInt();

        for (int n = 1; n <= ate; n++) {
            System.out.println(numero + "x" + n + "=" + numero * n);
        }

    }
}
