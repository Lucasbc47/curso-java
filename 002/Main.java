public class Main {
    public static void main(String[] args){
      
        String lista[] =  {"azul", "verde", "roxo"};
        int i = 0;
      
        while (i < lista.length) {
            String elemento = lista[i];

            if (elemento == "azul") {
                System.out.println("azul");
            }

            else if (elemento == "verde"){
                i+= 1;
                continue;
            }
          
            else {
                break;
            }
          
            i += 1;

        }
    }
}
