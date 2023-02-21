import java.util.Scanner;
public class TrianguloPascal {
    public static void main(String[] args) {

        int linhas = 5;

        for (int i = 0; i < linhas; i++){
            for (int j = linhas; j > i; j--){
                System.out.print(" ");
            }

            int x = 1;

            for (int j = 0; j<= i; j++){
                System.out.print(x + " ");
                x = x * (i - j) / (j+1);
            }
            System.out.println("");
        }

    }
}
