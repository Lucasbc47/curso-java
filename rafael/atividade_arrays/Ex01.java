import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args){
        /*
            1. Escreva um programa que cria um array de números inteiros e calcula a soma de todos
            os elementos do array sem o uso de métodos ou funções adicionais.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o tamanho do arr: ");

        int tamanho = sc.nextInt();
        int[] arr = new int[tamanho]; // 5
        int soma = 0; // 0

        System.out.println("Vá inserindo cada numero: ");
        for (int i=0; i<=arr.length; i++){
            // arr[0] = 1;
            // arr[1] = 300;
            arr[i] = sc.nextInt();
            soma += arr[i];
        }
        System.out.println("Somatoria: " + soma);
        sc.close();

    }
}
