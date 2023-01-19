package models;

import models.base.Produto;

public class Livro extends Produto {
    private String genero;
    private String escritor;
    private String editora;

    public Livro(double preco) {
        super(preco);
    }

    public Livro(double preco, String nome) {
        super(preco, nome);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
