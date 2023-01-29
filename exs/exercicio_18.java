import java.util.Scanner;

public class exercicio_18 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o texto que deseja quebrar:");
        String texto = scanner.nextLine();

        for(int i = 0; i < texto.length(); i++){
            System.out.print(texto.charAt(i) + " ");
            // .charAt()
            // é o metodo de String que retorna o carectere
            // localizado.
            // dentro dos parenteses, vc passa o numero/posição
        }
    }
}
