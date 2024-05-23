
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        /*
         * 12. Dados três valores A, B e C, 
         * construa um programa em JAVA que imprima os valores de forma
        descendente (do maior para o menor).
         */
        Scanner sc = new Scanner(System.in);
        
        Integer[] arr = new Integer[3]; // tera 3 valores, a, b e c.
        // criamos um array pra guardar nossos inteiros
        // os colchetes [] indica que é array
        // chamei ele de arr... e defini que será de inteiros *Integer*

        int num;

        for (int i=0; i<3; i++){
            System.out.println("Insira o n" + (i+1) + ": ");
            num = sc.nextInt();
            arr[i] = num;
            // loop percorre de 1 a 3 e vai adicionado numeros ao array
        }  
        
        // funcao externa pra ordenar nosso array. sort faz do menor pro maior porem..
        Arrays.sort(arr, Collections.reverseOrder());
        // queremos do maior pro menor, logo chamamos func reverse order
        // do collections que ja faz esse trampo

        // arr.length retorna quantidade de itens no array.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

}
