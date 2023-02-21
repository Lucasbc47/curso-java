class Cliente {
    String nome;
    String endereco;
    String telefone;

    Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome + " - Endereço: " + endereco + " - Telefone: " + telefone;
    }
}
