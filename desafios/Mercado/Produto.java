class Produto {
    String nome;
    String descricao;
    double preco;
    String dataVencimento;

    int codigo;

    Produto(String nome, String descricao, double preco, String dataVencimento, int codigo) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.dataVencimento = dataVencimento;
        this.codigo = codigo;
    }

    public int getCodigo(){
        return codigo;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " - Descrição: " + descricao + " - Preço: R$" + preco + " - Vencimento: " + dataVencimento + "- Codigo: " + codigo;
    }
}