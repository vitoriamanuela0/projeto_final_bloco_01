package loja.model;

public abstract class Produto {

    String nome;
    int codigo;
    int quantidade;

    public Produto(String nome, int codigo, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto [nomeProduto=" + nome + ", codigoProduto=" + codigo + ", quantidadeProduto=" + quantidade + "]";
    }

    public String getNomeProduto() {
        return nome;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nome = nomeProduto;
    }

    public int getCodigoProduto() {
        return codigo;
    }

    public void setCodigoProduto(int codigoProduto) {
        this.codigo = codigoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidade;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidade = quantidadeProduto;
    }

    public void visualizar() {
        System.out.println("\n\n***********************************************************");
        System.out.println("Dados do produto:");
        System.out.println("***********************************************************");
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Código do produto: " + this.codigo);
        System.out.println("Quantidade de produto: " + this.quantidade);
    }
}
