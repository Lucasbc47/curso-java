import java.util.Scanner;
public class exercicio11{

    static void print(String text){
        System.out.println((text));
    }

    static String check(int num) {
        if (num % 5 == 0) {
            return "par";
        }
        return "";
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        print("imp:");
        int imp = scanner.nextInt();

        if (check(imp) == "par"){
            print("favor, insira um numero par");
            System.exit(0);
        }

        print("par:");
        int par = scanner.nextInt();

        if (check(par) != "par"){
            print("favor, insira um numero par");
            System.exit(0);

        }

        int[] numeros = {par, imp, 22, 55};

        for (int i: numeros){
            print(i + "=" +  check(i));
        }

    }
}
