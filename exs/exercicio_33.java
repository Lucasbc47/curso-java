import java.util.ArrayList;
import java.util.List;

public class exercicio_33 {

    public static void main(String[] args) {

        int[][] matriz = {
                {10, 20, 30},
                {50, 60, 70},
                {90, 100, 110}
        };
        List<List<Integer>> nova_matriz = new ArrayList<>();

        for (int i=0; i < 2 * matriz.length - 1; i++) {
            nova_matriz.add(new ArrayList<>());
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                nova_matriz.get(i + j).add(matriz[i][j]);
            }
        }

        for (List<Integer> elemento: nova_matriz) {
            System.out.println(elemento);
        }
    }
}
