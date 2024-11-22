package loja.model;

public class Roupa extends Produto {

    private String tamanho;

    public Roupa(String nome, int codigo, int quantidade, String tamanho) {
        super(nome, codigo, quantidade);
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Tamanho da roupa: " + tamanho);
    }
}
