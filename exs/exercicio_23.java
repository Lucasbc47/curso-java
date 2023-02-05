import java.util.Scanner;

public class exercicio_23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um numero para ver se é positivo ou negativo");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Negativo");
        }
        else {
            System.out.println("Positivo");
        }



    }
}
