package loja.model;

public class Produto {
	
	String nome;
	int codigo = 0;
	int quantidade = 0;
	
	
	public Produto(String nome, int codigo, int quantidade) {
		this.nome = nome;
		this.codigo = codigo;
		this.quantidade = quantidade;
	}
	
	@Override
	
    public String toString() {
        return "Loja [nomeProduto=" + nome + ", codigoProduto=" + codigo + ", quantidadeProduto=" + quantidade + "]";
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
}
