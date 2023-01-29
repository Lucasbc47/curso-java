import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double produto = scanner.nextDouble();
        int desconto = scanner.nextInt();
        
        double valor_final = (produto-(produto/100) * desconto);

        System.out.println("Valor do produto R$: " + produto);
        System.out.println("Desconto de: " + desconto + "%");
        System.out.println("Valor final R$: " + valor_final);
    }
}
