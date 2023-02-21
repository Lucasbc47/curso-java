class Estoque {
    Produto produto;
    int quantidade;

    Estoque(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto(){
        return produto;
    }

    public void setQuantidade(int q){
        quantidade = q;
    }


    public int getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + produto.nome + " - Quantidade: " + quantidade;
    }
}
