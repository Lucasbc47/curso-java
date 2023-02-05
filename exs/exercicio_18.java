<<<<<<< HEAD
import java.util.Scanner;

public class exercicio_18{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeira variavel:");
        String first_content = scanner.nextLine();

        System.out.println("Segunda variavel:");
        String second_content = scanner.nextLine();

        if (first_content.length() == 0 && second_content.length() == 0){
            System.out.println("Favor, insira pelo menos uma palavra!");
            System.exit(0);
        }

        boolean t = first_content.contains(second_content);
        System.out.println(t);
    }
}
=======
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
>>>>>>> bda96665f6f3171a2ed4a2aef52ef2ffeb2840e7
