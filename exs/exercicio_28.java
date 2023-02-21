import java.util.Scanner;

public class exercicio_28 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o número que deseja ver o cubo de um número");
        int num = input.nextInt();
        for (int i=1; i <= num; i++){
            double c = Math.pow(i, 3);
            System.out.println(i + "=" + c);
        }
    }
}
