import java.util.ArrayList;
import java.util.Scanner;
public class exercicio_32 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um elemento para remover do array:");

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(25); arr.add(14); arr.add(56); arr.add(15); arr.add(36);
        System.out.println(arr);

        int num = scanner.nextInt();
        boolean check = arr.contains(num);

        if (check){
            System.out.println("Removido elemento: " + num);
            arr.remove(Integer.valueOf(num));
        }

        else{
            System.out.println("Não encontrado elemento: " + num);
        }

        System.out.println("Array:\n" + arr);

    }
}
