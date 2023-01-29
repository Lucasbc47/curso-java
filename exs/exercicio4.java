import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira numero para ver a tabuada: ");
        int numero = scanner.nextInt();
        System.out.println("Insira até que número deseja ver a tabuada");
        int ate = scanner.nextInt();


        for (int n = 1; n <= ate; n++) {
            System.out.println(numero + "x" + n + "=" + numero * n);
        }



    }
}
//

//import javax.swing.JFrame;
//
//public class Main {
//
//    public static void main(String[] args){
//        // Initialize frame
//        JFrame miJFrame = new JFrame("Java UI");
//        miJFrame.setSize(100,200);
//
//
//        // Make frame visible
//        miJFrame.setVisible(true);
//    }
//}
