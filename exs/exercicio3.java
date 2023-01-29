// Conversão de real para dolar
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("R$: ");

        double real = scanner.nextDouble();
        double quotation = 5.10;
        double conversion = real / quotation;

        System.out.printf("U$: %.2f%n", conversion);
    }
}
