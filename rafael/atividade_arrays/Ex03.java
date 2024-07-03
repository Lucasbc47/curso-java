public class Ex03 {
    public static void main(String[] args) {
            /*
            3. Escreva um programa que cria um array de números inteiros e inverte a ordem dos
            elementos no array sem o uso de métodos ou funções adicionais.
             */
        int[] arr = {3, 9, 1, 2, 33, 44};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start = start + 1;
            end = end - 1;
        }

        for (int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}

