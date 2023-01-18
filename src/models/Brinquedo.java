package models;

import models.base.Produto;

public class Brinquedo extends Produto {
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
