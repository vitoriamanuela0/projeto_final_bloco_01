package produto.controller;

import produto.repository.ProdutoRepository;
import loja.model.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoController implements ProdutoRepository {

    private static List<Produto> produtos = new ArrayList<>();

    @Override
    public void cadastrarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto cadastrado com sucesso!");
    }

    @Override
    public Produto buscarProduto(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigoProduto() == codigo) {
                return produto;
            }
        }
        System.out.println("Produto não encontrado!");
        return null;
    }

    @Override
    public void atualizarProduto(int codigo, Produto novoProduto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigoProduto() == codigo) {
                produtos.set(i, novoProduto);
                System.out.println("Produto atualizado com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado para atualização!");
    }

    @Override
    public void excluirProduto(int codigo) {
        Produto produto = buscarProduto(codigo);
        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto excluído com sucesso!");
        } else {
            System.out.println("Produto não encontrado para exclusão!");
        }
    }

    public static void exibirProdutos() {
        for (Produto produto : produtos) {
            produto.visualizar();
        }
    }
}
