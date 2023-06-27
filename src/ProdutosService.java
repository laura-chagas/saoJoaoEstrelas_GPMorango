import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdutosService {
    static List<Produtos> listaProdutos = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);

    public void cadastrarProdutos() {
        System.out.println("Digite o nome do produto que deseja cadastrar: ");
        String produto = entrada.next();


        System.out.println("Digite a quantidade: ");
        int quantidade = entrada.nextInt();

        System.out.println("Digite o valor unitário do produto: ");
        double valorUnitario = entrada.nextDouble();

        System.out.println("Quantos ingredientes gostaria de cadastrar: ");
        int quantIngredientes = entrada.nextInt();

        List<String> descricaoReceita = new ArrayList<>();

        for (int i = 0; i < quantIngredientes; i++) {
            System.out.println("Digite o " + (i + 1) + " ingrediente: ");
            descricaoReceita.add(entrada.next());

        }
        System.out.println("Produto cadastrado com sucesso!");
        listaProdutos.add(new Produtos(produto, descricaoReceita, quantidade, valorUnitario));
    }

    public void mostrarProdutosCadastrados() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado");
        } else {
            System.out.println("Produtos cadastrados!");
            for (Produtos produtosCadastrados : listaProdutos) {
                System.out.println("Nome do produto: " + produtosCadastrados.getNomeProduto());
            }
            System.out.println("Deseja acessar os detalhes de algum produto? ");
            System.out.println("1 - SIM    2 - NÃO");

            switch (entrada.nextInt()) {
                case 1:
                    System.out.println("Digite o nome do produto que deseja acessar: ");
                    String produtoDesejado = entrada.next();

                    for (Produtos produtos : listaProdutos) {
                        if (produtos.getNomeProduto().equals(produtoDesejado)) {
                            System.out.println("Nome: " + produtos.getNomeProduto() +
                                    "\nDescrição: " + produtos.getDescricaoReceita() + "\nQuantidade: " + produtos.getQuantidade() + "\nValor unitário: " + produtos.getValorUnitario());
                        }
                    }
                    break;
                case 2:
                    return;
                default:
                    throw new IllegalArgumentException("Opção inválida");
            }
        }
    }
    public void totalProdutorCadastrados() {
        double valorTotal = 0;
        for(Produtos total : listaProdutos) {
            System.out.println("Nome: " + total.getNomeProduto());
            System.out.println("Valor: " + (total.getValorUnitario() * total.getQuantidade()));
            valorTotal += total.getValorUnitario() * total.getQuantidade();
        }
        System.out.println("Valor total dos produtos: " + valorTotal);
    }
}