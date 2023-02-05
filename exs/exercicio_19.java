<<<<<<< HEAD
import java.util.Scanner;
    public class exercicio_19 {
        public static void main(String[] args){

            // Inversão de strings
            Scanner scanner = new Scanner(System.in);
            System.out.println("Insira a string que deseja inverter:");
            String first_text = scanner.nextLine();

            if (first_text.isBlank()){
                System.exit(0);
            }

            String[] text_array = first_text.split(" ");

            for (int i= text_array.length - 1; i<=first_text.length(); i--){
                System.out.print(text_array[i] + " ");
            }

        }
    }







=======
import java.util.Scanner;

public class exercicio_19{

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
>>>>>>> bda96665f6f3171a2ed4a2aef52ef2ffeb2840e7
