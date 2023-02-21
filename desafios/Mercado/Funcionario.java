class Funcionario {
    String nome;
    String cargo;
    double salario;

    Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + " - Cargo: " + cargo + " - Salário: R$" + salario;
    }
}
