import java.util.Scanner;
public class Menu {
    Scanner entrada = new Scanner(System.in);
    public void menuOpcoes() {
        ProdutosService produtosService = new ProdutosService();
        boolean sistema = true;
        System.out.println("Bem-Vinda(o) ao São João do Estrelas! ");
        while (sistema) {

            System.out.println("Por favor, digite:");
            System.out.println("[1] Cadastrar produto   [2]MOSTRAR PRODUTOS    [3] CONSULTAR VALOR TOTAL  [4] SAIR DO SISTEMA");

            switch (entrada.nextInt()) {
                case 1:
                    produtosService.cadastrarProdutos();
                    break;
                case 2:
                    produtosService.mostrarProdutosCadastrados();
                    break;
                case 3:
                    produtosService.totalProdutorCadastrados();
                    break;
                case 4:
                    System.out.println("Encerrando progarama ...");
                    sistema = false;
                    break;
                default: throw new IllegalArgumentException("Opção inválida");
            }
        }
    }
}