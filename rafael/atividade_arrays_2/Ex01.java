import java.util.Scanner;

public class Ex01 {
    /*
        1. Desenvolva um programa que, dado um número inteiro específico,
        verifique se ele está presente em um array de números inteiros.
        Utilize apenas estruturas de controle e variáveis simples para percorrer o array
        e realizar a verificação.
     */
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero:");

        int num = scanner.nextInt();
        boolean presente = false;

        for (int i=0; i<arr.length; i++){
            if (arr[i] == num){
                presente = true;
                break;
            }
        }

        System.out.println("O numero se encontra no array: " + presente);
        scanner.close();
    }
}
