import java.util.Scanner;

public class Ex03 {
    /*
     * 3. Crie uma classe Retângulo com dois atributos privados: largura e altura. A
     * classe deve conter
     * métodos para calcular a área e o perímetro do retângulo. Além disso, deve ter
     * um método
     * para verificar se o retângulo é quadrado (ou seja, largura igual à altura).
     */
    public static class Retangulo {
        private double base;
        private double altura;

        public Retangulo(double altura, double base) {
            this.altura = altura;
            this.base = base;
        }

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }

        public double calculaArea() {
            return this.base * this.altura;
        }

        public double calculaPerimetro() {
            return 2 * (this.base + this.altura);
        }

        public boolean ehQuadrado() {
            return this.base == this.altura;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a altura:");
        double altura = scanner.nextDouble();

        System.out.println("Insira a base: ");
        double base = scanner.nextDouble();

        if (altura <= 0 || base <= 0) {
            System.out.println("Altura e base devem ser valores positivos.");
        } else {
            Retangulo retangulo = new Retangulo(altura, base);
            System.out.println("Área do seu retângulo: " + retangulo.calculaArea());
            System.out.println("Perímetro do seu retângulo: " + retangulo.calculaPerimetro());
            System.out.println("Se trata de um retângulo quadrado? " + (retangulo.ehQuadrado() ? "sim" : "não"));
        }
        scanner.close();
    }
}
