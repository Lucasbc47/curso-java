import java.util.Scanner;

public class Ex07 {
    /*
     * 7. Crie um método que conte o número de vogais em uma string dada. Utilize
     * uma estrutura de
     * repetição para percorrer a string e uma estrutura condicional para verificar
     * as vogais.
     */

    public static int contarVogais(String texto) {
        int vogais = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais += 1;
            }
        }
        return vogais;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o texto: ");
        String texto = sc.nextLine();
        System.out.println("Ha " + contarVogais(texto) + " voga(l/is) no texto...");
        sc.close();
    }
}
