package services;

import models.base.Produto;
import services.throwables.DuplicateIdError;
import services.throwables.IdNotFoundException;

import java.util.Arrays;
import java.util.HashMap;

public class Caixa {
    private Double dinheiro;
    private HashMap<Class<? extends Produto>, Estoque> estoques = new HashMap<>();

    public Caixa(Double dinheiroInicial) {
        this.dinheiro = dinheiroInicial;
    }

    public Double getDinheiro() {
        return dinheiro;
    }

    public int getEstoqueCount() {
        return Estoque.getGlobalCount();
    }

    public int getProdutoCount(Class<? extends Produto> c) {
        try {
            return estoques.get(c).getCategoryCount();
        } catch (NullPointerException e) {
            return 0;
        }
    }

    public <P extends Produto> boolean cadastraProduto(P produto) throws DuplicateIdError {

        Estoque<P> estoque = estoques.get(produto.getClass());

        if (estoque == null) {
            estoque = new Estoque<>();
            estoques.put(produto.getClass(), estoque);
        }

        if (estoque.getProdutoById(produto.getId()) != null) {
            throw new DuplicateIdError(produto.getId());
        }

        estoque.cadastraProduto(produto);
        return true;

    }



    public <P extends Produto> boolean vendeProduto(P produto) {
        try {
            P produtoSistema = (P) estoques.get(produto.getClass()).popProdutoById(produto.getId());
            dinheiro += produtoSistema.getPreco();
            return true;
        } catch (Exception e) {
            System.err.printf("[ERROR] at %s at %s\n", e.getMessage(), Arrays.stream(e.getStackTrace()).toList());
        }
        return false;
    }
}
