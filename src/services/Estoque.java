package services;

import models.base.Produto;
import services.throwables.IdNotFoundException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Estoque <P extends Produto> {
    private Map<String, P> produtos = new HashMap<>();
    private static int count = 0;

    public static int getGlobalCount(){
        return count;
    }

    public int getCategoryCount() {
        return produtos.size();
    }

    public List<P> getListProdutos() {
        return produtos.values().stream().toList();
    }

    public void cadastraProduto(P produto) {
        produtos.put(produto.getId(), produto);
        count++;
    }

    public boolean editProduto(P produto) throws IdNotFoundException {
        if (getProdutoById(produto.getId()) == null) {
            throw new IdNotFoundException(produto.getId());
        }
        produtos.put(produto.getId(), produto);
        return true;
    }

    public P getProdutoById(String id) {
        P produto = produtos.get(id);

        return produto;
    }

    public P popProdutoById(String id) throws IdNotFoundException {
        P produto = produtos.get(id);

        if (produto == null) {
            throw new IdNotFoundException(id);
        }

        produtos.remove(id);
        count--;
        return produto;
    }
}
