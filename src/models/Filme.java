package models;

import models.base.Produto;

import java.util.List;

public class Filme extends Produto {
    private String estudio;
    private List<String> diretores;
    private List<String> generos;
    private List<String> produtores;

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public List<String> getDiretores() {
        return diretores;
    }

    public void setDiretores(List<String> diretores) {
        this.diretores = diretores;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public List<String> getProdutores() {
        return produtores;
    }

    public void setProdutores(List<String> produtores) {
        this.produtores = produtores;
    }
}
