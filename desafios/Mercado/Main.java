import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<Fornecedor> fornecedores = new ArrayList<>();
    static ArrayList<Produto> produtos = new ArrayList<>();
    static ArrayList<Estoque> estoque = new ArrayList<>();

    static ArrayList<Pedido> pedidos = new ArrayList<>();

    public static void main(String[] args) {
        // Criando alguns funcionários, clientes, fornecedores e produtos para testar o programa
        Funcionario funcionario1 = new Funcionario("João", "12345678901", 250.0);
        Funcionario funcionario2 = new Funcionario("Maria", "23456789012", 360.0);

        // Adicionando funcionários, clientes, fornecedores e produtos às listas correspondentes
        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);

        Cliente cliente1 = new Cliente("Pedro", "Rua A, 123", "1111-1111");
        Cliente cliente2 = new Cliente("Ana", "Rua B, 456", "2222-2222");

        clientes.add(cliente1);
        clientes.add(cliente2);

        Fornecedor fornecedor1 = new Fornecedor("Fornecedor A", "Av. X, 789", "3333-3333");
        Fornecedor fornecedor2 = new Fornecedor("Fornecedor B", "Av. Y, 456", "4444-4444");

        fornecedores.add(fornecedor1);
        fornecedores.add(fornecedor2);

        Produto produto1 = new Produto("Arroz", "Pacote 1kg", 5.0, "01/03/2023", 333);
        Produto produto2 = new Produto("Feijão", "Pacote 1kg", 6.0, "01/04/2023", 334);
        Produto produto3 = new Produto("Macarrão", "Pacote 500g", 3.0, "01/05/2023", 335);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        Estoque estoque1 = new Estoque(produto1, 10);
        Estoque estoque2 = new Estoque(produto2, 20);
        Estoque estoque3 = new Estoque(produto3, 30);

        estoque.add(estoque1);
        estoque.add(estoque2);
        estoque.add(estoque3);

        // Executando o menu principal
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("====== MERCADO ======");
            System.out.println("1. Comprar produtos");
            System.out.println("2. Ver estoque");
            System.out.println("3. Ver pedidos");
            System.out.println("4. Ver clientes");
            System.out.println("5. Sair");
            System.out.println("=====================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    comprarProdutos();
                    break;
                case 2:
                    verEstoque();
                    break;
                case 3:
                    verPedidos();
                    break;
                case 4:
                    verClientes();
                    break;
                case 5:
                    System.out.println("Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    public static void comprarProdutos() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== COMPRAR PRODUTOS ======");

        // Mostrando os produtos disponíveis
        System.out.println("Produtos disponíveis:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        // Escolhendo o produto e a quantidade
        System.out.print("Escolha o código do produto que deseja comprar: ");
        int codigoProduto = scanner.nextInt();
        System.out.print("Digite a quantidade que deseja comprar: ");
        int quantidade = scanner.nextInt();

        // Verificando se o produto está disponível em estoque
        Produto produtoEscolhido = null;
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigoProduto) {
                produtoEscolhido = produto;
                break;
            }
        }

        if (produtoEscolhido == null) {
            System.out.println("Produto não encontrado.");
            return;
        }

        Estoque estoqueProduto = null;

        for (Estoque e : estoque) {
            if (e.getProduto().getCodigo() == codigoProduto) {
                estoqueProduto = e;
                break;
            }
        }

        if (estoqueProduto == null) {
            System.out.println("Produto sem estoque.");
            return;
        }

        if (quantidade > estoqueProduto.getQuantidade()) {
            System.out.println("Quantidade indisponível em estoque.");
            return;
        }

        // Escolhendo o cliente
        System.out.println("Escolha o cliente:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((i + 1) + ". " + clientes.get(i));
        }
        int codigoCliente = scanner.nextInt();
        if (codigoCliente < 1 || codigoCliente > clientes.size()) {
            System.out.println("Código de cliente inválido.");
            return;
        }

        Cliente cliente = clientes.get(codigoCliente - 1);

        // Finalizando a compra
        Pedido pedido = new Pedido(cliente, produtoEscolhido, quantidade, pedidos);
        estoqueProduto.setQuantidade(estoqueProduto.getQuantidade() - quantidade);
        System.out.println("Compra realizada com sucesso." + pedido);
    }

    public static void verEstoque() {
        System.out.println("====== ESTOQUE ======");
        for (Estoque e : estoque) {
            System.out.println(e);
        }
    }

    public static void verPedidos() {
        System.out.println("====== PEDIDOS ======");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    public static void verClientes() {
        System.out.println("====== CLIENTES ======");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}

