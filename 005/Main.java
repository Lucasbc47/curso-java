import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = "Lucas";
        String raw = text;

        System.out.println("[to_replace]:");
        String to_replace = scanner.next();

        text = to_replace;
        System.out.println(to_replace + raw);

    }
}
