public class Ex02 {
    public static void main(String[] args) {
        /*
            2. Escreva um programa que cria um array de números inteiros e encontra o maior e o
            menor valor no array sem o uso de métodos ou funções adicionais.
         */
                 // 0,  1, 2, 3, 4, 5
        int arr[] = {3, 7, 1, 9, 12, 15};

        int menor = arr[0];
        int maximo = arr[0];

        for (int i=0; i < arr.length; i++){

            if (arr[i] > maximo){
                maximo = arr[i];
            }
            if (arr[i] < menor){
                menor = arr[i];
            }
        }

        System.out.println("min: " + menor);
        System.out.println("max: " + maximo);
    }
}
