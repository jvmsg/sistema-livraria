package models;

import models.base.Produto;

public class Brinquedo extends Produto {
    private String tipo;

    public Brinquedo(double preco) {
        super(preco);
    }

    public Brinquedo(double preco, String nome) {
        super(preco, nome);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
