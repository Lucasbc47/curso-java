import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("String 1:");
        String one = scanner.nextLine();

        System.out.println("String 2:");
        String two = scanner.nextLine();

        if (one.equals(two)){
            System.out.println("é igual");
        }
        else {
            System.out.println("é diferente");
        }
    }
}


