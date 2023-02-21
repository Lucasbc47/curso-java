import java.util.Scanner;
public class exercicio_31 {
    public static void main(String[] args) {

        String[] arr = {"mussarela", "catupiry", "chocolate", "calabresa", "4queijos"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um sabor de pizza:");
        String sabor = scanner.nextLine();

        for (int i=0; i < arr.length; i++){

            if (sabor.equals(arr[i])){
                System.out.println("se encontra no index: " + i);
            }

            else {
                System.out.println("nao se encontra");
            }


        }






    }
}
