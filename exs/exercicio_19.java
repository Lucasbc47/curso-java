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
