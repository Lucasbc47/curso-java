class Fornecedor {
    String nome;
    String endereco;
    String telefone;

    Fornecedor(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Fornecedor: " + nome + " - Endereço: " + endereco + " - Telefone: " + telefone;
    }
}