package Biblioteca;

import java.io.Serializable;

public class Livro implements Serializable {
    //Atributos
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    //Construtor
    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }
}