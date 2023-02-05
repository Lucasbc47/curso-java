import java.util.Scanner;

public class Abecadariano {
    public static void main(String[] args) {


        // Checker de Abecedario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o texto:");

        String text = scanner.nextLine();
        String fixed_text = text.toLowerCase();

        if (fixed_text.contains("abc")){
            System.out.println("Se trata de um abecedario");
        }
        else{
            System.out.println("Nao se trata de um abecedario");
        }

        // Maior e menor
        System.out.println("Sua string: " + fixed_text);





    }
}
