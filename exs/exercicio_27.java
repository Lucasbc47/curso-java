import java.io.IOException;
import java.util.Scanner;
public class exercicio_27 {

     static void vogal_consoante(String palavra) {
        String palavra_lower = palavra.toLowerCase();
        String[] vogais = {"a", "e", "i", "o", "u"};
        if (palavra_lower.length() == 1 && palavra_lower.matches("[a|z]") ){
            for (String vogal : vogais) {
                if (palavra_lower.equals(vogal)) {
                    System.out.println("A palavra: " + palavra_lower + " vogal");
                    break;
                }
                else{
                    System.out.println("A palavra: " + palavra_lower + " consoante");
                    break;
                }
            }
        }

        else {
            System.out.println("Insira apenas um carectere!\ne que esteja dentro do abedecario e remove os espaços em branco se possivel!");
        }

    }

    public static void main(String[] args) throws IOException, InterruptedException {

         while (true) {

             Scanner input = new Scanner(System.in);
             System.out.println("Insira uma palavra do abecedario [a|z]:");
             String palavra = input.nextLine();
             vogal_consoante(palavra);

             System.out.println("Deseja continuar? [s|n]");
             String option = input.nextLine();
             if (System.getProperty("os.name").contains("Windows"))
                 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
             else
                 Runtime.getRuntime().exec("clear");

             if (option.equals("n")) {
                 break;
             } else if (option.equals("s")) {
                 continue;
             }
             else{
                 System.out.println("Insira [s]: sim ou [n]: nao!");
                 break;
             }
         }





    }
}
