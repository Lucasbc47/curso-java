import java.util.Scanner;

public class exercicio_19{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("First variable:");
        String first_content = scanner.nextLine();
        System.out.println("Second variable:");
        String second_content = scanner.nextLine();

        boolean t = first_content.contains(second_content);
        System.out.println(t);
    }
}
