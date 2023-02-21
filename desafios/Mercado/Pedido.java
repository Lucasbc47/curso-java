import java.util.ArrayList;

class Pedido {
    Cliente cliente;
    Produto produtos;

    ArrayList<Pedido> pedidos;

    int quantidade;

    Pedido(Cliente cliente, Produto produtos, int quantidade, ArrayList<Pedido> pedidos) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.quantidade = quantidade;
        this.pedidos = pedidos;
    }

    public void setPedidos(Pedido p){
        pedidos.add(p);
    }


    public ArrayList<Pedido> getPedidos() {
        for (Pedido pedido: pedidos){
            return pedidos;
        }
        return null;
    }


    @Override
    public String toString() {
        return "Pedido de " + cliente.nome + ":\n" + produtos.nome;
    }
}