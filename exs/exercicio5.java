import java.util.Scanner;

public class exercicio5 {
    public static void exercicio5(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = "Lucas";
        String raw = text;

        System.out.println("[to_replace]:");
        String to_replace = scanner.next();

        text = to_replace;
        System.out.println(to_replace + raw);

    }
}
