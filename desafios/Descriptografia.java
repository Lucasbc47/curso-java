import java.util.Scanner;

public class Descriptografia {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a criptografia gerada:");
        String encriptado = scanner.nextLine();

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

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < encriptado.length(); i+=3) {

            String texto = encriptado.substring(i, i + 3);

            if (texto.equals(zero)) {
                sb.append("0");
            } else if (texto.equals(um)) {
                sb.append("1");
            } else if (texto.equals(dois)) {
                sb.append("2");
            } else if (texto.equals(tres)) {
                sb.append("3");
            } else if (texto.equals(quatro)) {
                sb.append("4");
            } else if (texto.equals(cinco)) {
                sb.append("5");
            } else if (texto.equals(seis)) {
                sb.append("6");
            } else if (texto.equals(sete)) {
                sb.append("7");
            } else if (texto.equals(oito)) {
                sb.append("8");
            } else if (texto.equals(nove)) {
                sb.append("9");
            }
        }
        System.out.println("Chave de descriptografia:\n" + sb.toString());
    }
}
