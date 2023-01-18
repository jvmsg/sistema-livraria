package models.base;

import java.util.UUID;

public abstract class Produto {
    private String nome;
    private String id;
    private double preco;

    public Produto() {
        this.id = UUID.randomUUID().toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
