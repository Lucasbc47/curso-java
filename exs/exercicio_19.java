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







