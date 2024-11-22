package produto.repository;

import loja.model.Produto;

public interface ProdutoRepository {
    void cadastrarProduto(Produto produto);
    Produto buscarProduto(int codigo);
    void atualizarProduto(int codigo, Produto produto);
    void excluirProduto(int codigo);
}