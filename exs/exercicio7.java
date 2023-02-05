public class exercicio7 {

    public static void exercicio7(String[] args){
        double c, k, f, re, ra;

        c = 2.43;
        f = c * 1.8 + 32;
        k = c + 273.15;
        ra  = c * 1.8 + 32 + 459.67;
        re = c * 0.8;

        System.out.println("Temperatura Celsius:" + c);
        System.out.println("Temperatura Fahrenheit:" + f);
        System.out.println("Temperatura Kelvin:" + k);
        System.out.println("Temperatura Reamur:" + re);
        System.out.println("Temperatura Rankine:" + ra);
    }
}
