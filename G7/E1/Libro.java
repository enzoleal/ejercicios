/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package G7.E1;

/**
 *
 * @author Usuario
 */
public class Libro {
    public String titulo;
    public String autor;
    public int isbn;
    public int numpag;

    public Libro() {
    }

    public Libro(String titulo, String autor, int isbn, int numpag) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numpag = numpag;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", numpag=" + numpag + '}';
    }
    
    
    
}
