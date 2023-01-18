package services;

import models.base.Produto;
import services.throwables.IdNotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estoque <P extends Produto> {
    private Map<String, P> produtos = new HashMap<>();

    public List<P> getListProdutos() {
        return produtos.values().stream().toList();
    }

    public void cadastraProduto(P produto) {
        produtos.put(produto.getId(), produto);
    }

    public P getProdutoById(String id) throws IdNotFoundException {
        P produto = produtos.get(id);

        if (produto == null) {
            throw new IdNotFoundException(id);
        }

        return produto;
    }

    public P popProdutoById(String id) throws IdNotFoundException {
        P produto = produtos.get(id);

        if (produto == null) {
            throw new IdNotFoundException(id);
        }

        produtos.remove(id);
        return produto;
    }
}
