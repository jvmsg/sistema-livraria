package models;

import models.base.Produto;

public class Jogo extends Produto {
    private String distribuidora;
    private String genero;
    private String estudio;

    public Jogo(double preco) {
        super(preco);
    }

    public Jogo(double preco, String nome) {
        super(preco, nome);
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
