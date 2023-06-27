import java.util.ArrayList;
import java.util.List;

public class Produtos {
    private String nomeProduto;
    private List<String> descricaoReceita;
    private int quantidade;
    private double valorUnitario;
    public Produtos() {
    }
    public Produtos(String nomeProduto, List<String> descricaoReceita, int quantidade, double valorUnitario) {
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.descricaoReceita = descricaoReceita;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public List<String> getDescricaoReceita() {
        return descricaoReceita;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setDescricaoReceita(List<String> descricaoReceita) {
        this.descricaoReceita = descricaoReceita;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
