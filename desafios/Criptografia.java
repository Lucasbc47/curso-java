import java.util.Scanner;

public class Criptografia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira números para criptografar:");
        int num = scanner.nextInt();

        String zero = "SWS";
        String um = "JHS";
        String dois = "HGV";
        String tres = "TWX";
        String quatro = "OLR";
        String cinco = "XEE";
        String seis = "ASA";
        String sete  = "DWD";
        String oito = "PLP";
        String nove = "XKX";

        String test = Integer.toString(num);
        String[] num_arr = test.split("");

        System.out.println("Criptografia criada.");

        for (int i = 0; i < num_arr.length; i++){

            if (num_arr[i].contains("0")){
                System.out.print(zero);
            } else if (num_arr[i].contains("1")) {
                System.out.print(um);
            }
            else if (num_arr[i].contains("2")) {
                System.out.print(dois);
            }
            else if (num_arr[i].contains("3")) {
                System.out.print(tres);
            }
            else if (num_arr[i].contains("4")) {
                System.out.print(quatro);
            }
            else if (num_arr[i].contains("5")) {
                System.out.print(cinco);
            }
            else if (num_arr[i].contains("6")) {
                System.out.print(seis);
            }
            else if (num_arr[i].contains("7")) {
                System.out.print(sete);
            }
            else if (num_arr[i].contains("8")) {
                System.out.print(oito);
            }
            else if (num_arr[i].contains("9")) {
                System.out.print(nove);
            }
        }
    }
}
