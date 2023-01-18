package models;

import models.base.Produto;

import java.util.List;

public class AlbumDeMusica extends Produto {
    private List<String> bandas;
    private List<String> generos;
    private List<String> selos;

    public List<String> getBandas() {
        return bandas;
    }

    public void setBandas(List<String> bandas) {
        this.bandas = bandas;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public void setGeneros(List<String> generos) {
        this.generos = generos;
    }

    public List<String> getSelos() {
        return selos;
    }

    public void setSelos(List<String> selos) {
        this.selos = selos;
    }
}
