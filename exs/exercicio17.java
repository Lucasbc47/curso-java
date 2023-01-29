public class exercicio17 {
    public static void main(String[] args) {

        System.out.println("Divisiveis por 3");
        for (int x=1; x < 100; x++){
            if (x % 3 == 0){
                System.out.print(x + " ");
            }

        }

        System.out.print("\n");
        System.out.println("Divisiveis por 5");

        for (int x=1; x < 100; x++){
            if (x % 5 == 0){
                System.out.print(x + " ");
            }
        }


        System.out.print("\n");
        System.out.println("Divisiveis por 3 e 5");

        for (int i=1; i < 100; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.print(i + " ");
            }

        }
    }
}
