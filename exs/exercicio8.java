import java.util.Scanner;
import java.util.Locale;

public class exercicio8 {
    public static void exercicio8(String[] args) {


        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        // Locale set to work with ','

        System.out.print("Base value:");

        double base = input.nextDouble();

        System.out.print("Height value:");

        double height = input.nextDouble();
        double ans = base*height/2;

        System.out.println("Result:" + ans);

    }
}
